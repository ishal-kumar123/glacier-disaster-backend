package org.example.glacierdisasterbackend.service;

import org.example.glacierdisasterbackend.model.SensorData;
import org.example.glacierdisasterbackend.repository.SensorDataRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorDataService {

    private final SensorDataRepository sensorDataRepository;

    public SensorDataService(SensorDataRepository sensorDataRepository) {
        this.sensorDataRepository = sensorDataRepository;
    }

    public SensorData saveSensorData(SensorData sensorData) {

        if (sensorData.getTimestamp() == null) {
            sensorData.setTimestamp(java.time.LocalDateTime.now());
        }

        return sensorDataRepository.save(sensorData);
    }

    public List<SensorData> getAllSensorData() {
        return sensorDataRepository.findAll();
    }
}