package com.ramon.broker.controller.dto;

public class EventDTO {
    private String id;
    private String name;
    private String timeOccurred;
    private String timeZoneOccurred;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeOccurred() {
        return timeOccurred;
    }

    public void setTimeOccurred(String timeOccurred) {
        this.timeOccurred = timeOccurred;
    }

    public String getTimeZoneOccurred() {
        return timeZoneOccurred;
    }

    public void setTimeZoneOccurred(String timeZoneOccurred) {
        this.timeZoneOccurred = timeZoneOccurred;
    }
}
