package org.example.glacierdisasterbackend.service;

import org.example.glacierdisasterbackend.model.RescueOperation;
import org.example.glacierdisasterbackend.repository.RescueOperationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RescueOperationService {

    private final RescueOperationRepository rescueOperationRepository;

    public RescueOperationService(
            RescueOperationRepository rescueOperationRepository) {
        this.rescueOperationRepository = rescueOperationRepository;
    }

    public RescueOperation createRescueOperation(
            RescueOperation rescueOperation) {

        if (rescueOperation.getStatus() == null ||
                rescueOperation.getStatus().isBlank()) {
            rescueOperation.setStatus("ASSIGNED");
        }

        if (rescueOperation.getAssignedTime() == null) {
            rescueOperation.setAssignedTime(LocalDateTime.now());
        }

        return rescueOperationRepository.save(rescueOperation);
    }

    public List<RescueOperation> getAllRescueOperations() {
        return rescueOperationRepository.findAll();
    }
}