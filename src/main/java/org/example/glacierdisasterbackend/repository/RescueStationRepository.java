package org.example.glacierdisasterbackend.repository;

import org.example.glacierdisasterbackend.model.RescueStation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RescueStationRepository
        extends MongoRepository<RescueStation, String> {
}