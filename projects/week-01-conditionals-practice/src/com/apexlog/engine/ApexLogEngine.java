package com.apexlog.engine;

import com.apexlog.model.TelemetryEvent;
import com.apexlog.model.ZoneCoordinate;

public class ApexLogEngine {

    // Module 1: Circular Telemetry Buffer Fields
    private final TelemetryEvent[] telemetryBuffer;
    private int head = 0;
    private int tail = 0;
    private int logCount = 0;

    // Module 2: Spatial Floor Grid Fields
    private final int[][] floorGrid;

    // Module 3: Elastic Spillover Storage for Critical Alerts
    private TelemetryEvent[] criticalAlerts;
    private int alertCount = 0;

    public ApexLogEngine(int bufferCapacity, int gridRows, int gridCols) {
        this.telemetryBuffer = new TelemetryEvent[bufferCapacity];
        this.floorGrid = new int[gridRows][gridCols];
        this.criticalAlerts = new TelemetryEvent[4]; // Small initial baseline capacity
    }

    /**
     * Module 1: Constructs a TelemetryEvent and safely inserts it into the circular array.
     */
    public void pushLog(String robotId, String status) {
        TelemetryEvent event = new TelemetryEvent(robotId, status);
        telemetryBuffer[head] = event;
        head = (head + 1) % telemetryBuffer.length;

        if (logCount < telemetryBuffer.length) {
            logCount++;
        } else {
            tail = (tail + 1) % telemetryBuffer.length;
        }
    }

    /**
     * Module 1: Collects and returns all telemetry logs mapped in strict
     * chronological order from oldest (tail) to newest.
     */
    public TelemetryEvent[] getAllLogs() {
        TelemetryEvent[] orderedLogs = new TelemetryEvent[logCount];
        int currentPointer = tail;

        for (int i = 0; i < logCount; i++) {
            orderedLogs[i] = telemetryBuffer[currentPointer];
            currentPointer = (currentPointer + 1) % telemetryBuffer.length;
        }

        return orderedLogs;
    }

    /**
     * Module 2: Increments the tracked movement metric inside your spatial floor grid.
     */
    public void recordMovement(int row, int col) {
        if (row >= 0 && row < floorGrid.length && col >= 0 && col < floorGrid[0].length) {
            floorGrid[row][col]++;
        }
    }

    /**
     * Module 2: Scans the spatial warehouse matrix grid using a 2-pass manual array allocation.
     */
    public ZoneCoordinate[] identifyingHighTrafficZones(int threshold) {
        // Step 1: Count fields exceeding threshold to size the final array manually
        int count = 0;
        for (int r = 0; r < floorGrid.length; r++) {
            for (int c = 0; c < floorGrid[r].length; c++) {
                if (floorGrid[r][c] > threshold) {
                    count++;
                }
            }
        }

        // Step 2: Populate the ZoneCoordinate array with fixed capacity matching the count
        ZoneCoordinate[] result = new ZoneCoordinate[count];
        int index = 0;
        for (int r = 0; r < floorGrid.length; r++) {
            for (int c = 0; c < floorGrid[r].length; c++) {
                if (floorGrid[r][c] > threshold) {
                    result[index++] = new ZoneCoordinate(r, c);
                }
            }
        }

        return result;
    }

    /**
     * Module 3: Appends high-priority alerts into storage, dynamically doubling
     * the underlying array size manually if capacity bounds are hit.
     */
    public void triggerCriticalAlert(String robotId, String criticalStatus) {
        // Check if array has filled up completely
        if (alertCount == criticalAlerts.length) {
            // Double the capacity size manually
            TelemetryEvent[] expandedStorage = new TelemetryEvent[criticalAlerts.length * 2];

            // Explicitly copy existing components across to the new storage array
            for (int i = 0; i < criticalAlerts.length; i++) {
                expandedStorage[i] = criticalAlerts[i];
            }
            this.criticalAlerts = expandedStorage;
        }

        // Add the fresh alert into our newly validated storage index
        criticalAlerts[alertCount++] = new TelemetryEvent(robotId, criticalStatus);
    }

    public ZoneCoordinate[] identifyHighTrafficZones(int i) {

        return null;
    }
}