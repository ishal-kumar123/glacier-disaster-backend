package org.example.glacierdisasterbackend.repository;

import org.example.glacierdisasterbackend.model.RiskPrediction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RiskPredictionRepository
        extends MongoRepository<RiskPrediction, String> {
}