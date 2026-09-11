package org.example.glacierdisasterbackend.controller;

import org.example.glacierdisasterbackend.model.SensorData;
import org.example.glacierdisasterbackend.service.SensorDataService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sensors")
@CrossOrigin(origins = "http://localhost:4200")
public class SensorDataController {

    private final SensorDataService sensorDataService;

    public SensorDataController(SensorDataService sensorDataService) {
        this.sensorDataService = sensorDataService;
    }

    @PostMapping
    public ResponseEntity<SensorData> saveSensorData(
            @RequestBody SensorData sensorData) {

        return ResponseEntity.ok(
                sensorDataService.saveSensorData(sensorData)
        );
    }

    @GetMapping
    public ResponseEntity<List<SensorData>> getAllSensorData() {

        return ResponseEntity.ok(
                sensorDataService.getAllSensorData()
        );
    }
}