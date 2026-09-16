package org.example.glacierdisasterbackend.service;

import org.example.glacierdisasterbackend.model.Alert;
import org.example.glacierdisasterbackend.repository.AlertRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AlertService {

    private final AlertRepository alertRepository;

    public AlertService(AlertRepository alertRepository) {
        this.alertRepository = alertRepository;
    }

    public Alert saveAlert(Alert alert) {

        if (alert.getTimestamp() == null) {
            alert.setTimestamp(LocalDateTime.now());
        }

        return alertRepository.save(alert);
    }

    public List<Alert> getAllAlerts() {
        return alertRepository.findAll();
    }
}