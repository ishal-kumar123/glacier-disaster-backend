package org.example.glacierdisasterbackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "rescue_stations")
public class RescueStation {

    @Id
    private String id;

    private String stationName;
    private String location;
    private double latitude;
    private double longitude;
    private String contactNumber;
    private int availableRescuers;
    private String status;

    public RescueStation() {
    }

    public RescueStation(String stationName,
                         String location,
                         double latitude,
                         double longitude,
                         String contactNumber,
                         int availableRescuers,
                         String status) {
        this.stationName = stationName;
        this.location = location;
        this.latitude = latitude;
        this.longitude = longitude;
        this.contactNumber = contactNumber;
        this.availableRescuers = availableRescuers;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getAvailableRescuers() {
        return availableRescuers;
    }

    public void setAvailableRescuers(int availableRescuers) {
        this.availableRescuers = availableRescuers;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}