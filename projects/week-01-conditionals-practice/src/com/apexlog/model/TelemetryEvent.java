package com.apexlog.model;

public class TelemetryEvent {
    private final long timestamp;
    private final String robotId;
    private final String status;

    public TelemetryEvent(String robotId, String status){
        this.timestamp = System.currentTimeMillis();
        this.robotId = robotId;
        this.status = status;
    }

    @Override
    public String toString() {
        return "TelemetryEvent [timestamp=" + timestamp + ", robotId=" + robotId + ", status=" + status;
    }
}