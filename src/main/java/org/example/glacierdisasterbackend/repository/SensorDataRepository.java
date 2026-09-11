package org.example.glacierdisasterbackend.repository;

import org.example.glacierdisasterbackend.model.SensorData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SensorDataRepository extends MongoRepository<SensorData, String> {
    
}