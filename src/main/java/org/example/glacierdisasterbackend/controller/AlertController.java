package org.example.glacierdisasterbackend.controller;

import org.example.glacierdisasterbackend.model.Alert;
import org.example.glacierdisasterbackend.service.AlertService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alerts")
@CrossOrigin(origins = "http://localhost:4200")
public class AlertController {

    private final AlertService alertService;

    public AlertController(AlertService alertService) {
        this.alertService = alertService;
    }

    @PostMapping
    public ResponseEntity<Alert> saveAlert(
            @RequestBody Alert alert) {

        return ResponseEntity.ok(
                alertService.saveAlert(alert)
        );
    }

    @GetMapping
    public ResponseEntity<List<Alert>> getAllAlerts() {

        return ResponseEntity.ok(
                alertService.getAllAlerts()
        );
    }
}