package com;

import com.apexlog.model.ZoneCoordinate;
import com.apexlog.model.TelemetryEvent;
import com.apexlog.engine.ApexLogEngine;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Initializing ApexLog Enterprise Engine ===");

        // Initialize engine: Buffer capacity of 5 logs, a 6x6 warehouse grid
        ApexLogEngine engine = new ApexLogEngine(5, 6, 6);


        // PHASE 1: Testing the Circular Buffer (Module 1)

        System.out.println("\n--- Phase 1: Simulating Inbound Telemetry Stream ---");
        engine.pushLog("ROBOT_01", "Battery Nominal (85%)");
        engine.pushLog("ROBOT_02", "Calibrating Lidar Sensors");
        engine.pushLog("ROBOT_01", "Moving to Loading Dock B");
        engine.pushLog("ROBOT_03", "Package Assigned");
        engine.pushLog("ROBOT_02", "Route Computed Safely");

        // Overwriting test: Pushing a 6th log to a buffer of capacity 5
        System.out.println("[System] Ingesting 6th log to force buffer overwrite condition...");
        engine.pushLog("ROBOT_01", "Arrived at Loading Dock B");

        System.out.println("\n[System] Fetching all logs in strict chronological order:");
        TelemetryEvent[] logs = engine.getAllLogs();
        if (logs != null && logs.length > 0) {
            for (TelemetryEvent log : logs) {
                if (log != null) System.out.println(log);
            }
        } else {
            System.out.println("❌ getAllLogs() returned empty. Complete the TODO inside ApexLogEngine!");
        }


        // PHASE 2: Testing Spatial Grid Tracking (Module 2)

        System.out.println("\n--- Phase 2: Recording Spatial Warehouse Movements ---");
        // Simulating heavy traffic at coordinate (2, 4)
        engine.recordMovement(2, 4);
        engine.recordMovement(2, 4);
        engine.recordMovement(2, 4);

        // Simulating moderate traffic at coordinate (5, 1)
        engine.recordMovement(5, 1);
        engine.recordMovement(5, 1);

        // Simulating standalone movement at coordinate (0, 0)
        engine.recordMovement(0, 0);

        System.out.println("[System] Querying coordinates with step-count threshold > 1:");
        ZoneCoordinate[] dangerousZones = engine.identifyHighTrafficZones(1);
        if (dangerousZones != null && dangerousZones.length > 0) {
            for (ZoneCoordinate zone : dangerousZones) {
                if (zone != null) System.out.println("🔥 High-Traffic Congestion Zone detected at: " + zone);
            }
        } else {
            System.out.println("❌ identifyHighTrafficZones() returned empty. Complete the TODO inside ApexLogEngine!");
        }


        // PHASE 3: Testing Elastic Array Resizing (Module 3)

        System.out.println("\n--- Phase 3: Testing Elastic Critical Alert Storage ---");
        System.out.println("[System] Flooding critical errors to test manual array expansion...");

        // Initial baseline capacity is 4. Pushing 5 elements to force the double-resize algorithm.
        engine.triggerCriticalAlert("ROBOT_02", "CRITICAL_HARDWARE_FAILURE_MOTOR_OVERHEAT");
        engine.triggerCriticalAlert("ROBOT_01", "CRITICAL_COLLISION_WARNING_OBSTACLE_DETECTED");
        engine.triggerCriticalAlert("ROBOT_03", "CRITICAL_LOW_POWER_SHUTDOWN_IMMINENT");
        engine.triggerCriticalAlert("ROBOT_02", "CRITICAL_LIDAR_DISCONNECTED_BLIND_NAVIGATION");
        engine.triggerCriticalAlert("ROBOT_01", "CRITICAL_EMERGENCY_STOP_TRIGGERED_BY_OPERATOR");

        System.out.println("[System] Ingestion sequence complete. Run validation checks.");
    }
}