package org.example.glacierdisasterbackend.service;

import org.example.glacierdisasterbackend.model.RiskPrediction;
import org.example.glacierdisasterbackend.repository.RiskPredictionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RiskPredictionService {

    private final RiskPredictionRepository riskPredictionRepository;

    public RiskPredictionService(RiskPredictionRepository riskPredictionRepository) {
        this.riskPredictionRepository = riskPredictionRepository;
    }

    public RiskPrediction savePrediction(RiskPrediction prediction) {

        if (prediction.getTimestamp() == null) {
            prediction.setTimestamp(LocalDateTime.now());
        }

        return riskPredictionRepository.save(prediction);
    }

    public List<RiskPrediction> getAllPredictions() {
        return riskPredictionRepository.findAll();
    }
}