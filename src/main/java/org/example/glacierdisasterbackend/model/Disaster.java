package org.example.glacierdisasterbackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "disasters")
public class Disaster {

    @Id
    private String id;

    private String disasterType;
    private String location;
    private String severity;
    private String description;
    private String status;

    private LocalDateTime startTime;

    public Disaster() {
    }

    public Disaster(String disasterType,
                    String location,
                    String severity,
                    String description,
                    String status,
                    LocalDateTime startTime) {

        this.disasterType = disasterType;
        this.location = location;
        this.severity = severity;
        this.description = description;
        this.status = status;
        this.startTime = startTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisasterType() {
        return disasterType;
    }

    public void setDisasterType(String disasterType) {
        this.disasterType = disasterType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
}