package org.example.glacierdisasterbackend.controller;

import org.example.glacierdisasterbackend.model.RiskPrediction;
import org.example.glacierdisasterbackend.service.RiskPredictionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/risk")
@CrossOrigin(origins = "http://localhost:4200")
public class RiskPredictionController {

    private final RiskPredictionService riskPredictionService;

    public RiskPredictionController(RiskPredictionService riskPredictionService) {
        this.riskPredictionService = riskPredictionService;
    }

    @PostMapping
    public ResponseEntity<RiskPrediction> savePrediction(
            @RequestBody RiskPrediction prediction) {

        return ResponseEntity.ok(
                riskPredictionService.savePrediction(prediction)
        );
    }

    @GetMapping
    public ResponseEntity<List<RiskPrediction>> getAllPredictions() {

        return ResponseEntity.ok(
                riskPredictionService.getAllPredictions()
        );
    }
}