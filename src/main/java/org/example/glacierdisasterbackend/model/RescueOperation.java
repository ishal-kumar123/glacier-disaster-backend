package org.example.glacierdisasterbackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "rescue_operations")
public class RescueOperation {

    @Id
    private String id;

    private String sosRequestId;
    private String rescueStationId;
    private String rescueTeamName;

    private String status;
    private LocalDateTime assignedTime;
    private LocalDateTime completedTime;

    public RescueOperation() {
    }

    public RescueOperation(String sosRequestId,
                           String rescueStationId,
                           String rescueTeamName,
                           String status,
                           LocalDateTime assignedTime,
                           LocalDateTime completedTime) {
        this.sosRequestId = sosRequestId;
        this.rescueStationId = rescueStationId;
        this.rescueTeamName = rescueTeamName;
        this.status = status;
        this.assignedTime = assignedTime;
        this.completedTime = completedTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSosRequestId() {
        return sosRequestId;
    }

    public void setSosRequestId(String sosRequestId) {
        this.sosRequestId = sosRequestId;
    }

    public String getRescueStationId() {
        return rescueStationId;
    }

    public void setRescueStationId(String rescueStationId) {
        this.rescueStationId = rescueStationId;
    }

    public String getRescueTeamName() {
        return rescueTeamName;
    }

    public void setRescueTeamName(String rescueTeamName) {
        this.rescueTeamName = rescueTeamName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getAssignedTime() {
        return assignedTime;
    }

    public void setAssignedTime(LocalDateTime assignedTime) {
        this.assignedTime = assignedTime;
    }

    public LocalDateTime getCompletedTime() {
        return completedTime;
    }

    public void setCompletedTime(LocalDateTime completedTime) {
        this.completedTime = completedTime;
    }
}