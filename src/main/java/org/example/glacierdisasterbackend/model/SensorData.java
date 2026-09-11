package org.example.glacierdisasterbackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "sensor_data")
public class SensorData {

    @Id
    private String id;

    private double temperature;
    private double iceMovement;
    private double waterLevel;
    private double snowfall;
    private double seismicActivity;

    private String location;
    private LocalDateTime timestamp;

    public SensorData() {
    }

    public SensorData(double temperature,
                      double iceMovement,
                      double waterLevel,
                      double snowfall,
                      double seismicActivity,
                      String location,
                      LocalDateTime timestamp) {

        this.temperature = temperature;
        this.iceMovement = iceMovement;
        this.waterLevel = waterLevel;
        this.snowfall = snowfall;
        this.seismicActivity = seismicActivity;
        this.location = location;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getIceMovement() {
        return iceMovement;
    }

    public void setIceMovement(double iceMovement) {
        this.iceMovement = iceMovement;
    }

    public double getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(double waterLevel) {
        this.waterLevel = waterLevel;
    }

    public double getSnowfall() {
        return snowfall;
    }

    public void setSnowfall(double snowfall) {
        this.snowfall = snowfall;
    }

    public double getSeismicActivity() {
        return seismicActivity;
    }

    public void setSeismicActivity(double seismicActivity) {
        this.seismicActivity = seismicActivity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}