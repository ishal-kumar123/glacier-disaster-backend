package org.example.glacierdisasterbackend.service;

import org.example.glacierdisasterbackend.model.RescueOperation;
import org.example.glacierdisasterbackend.model.SosRequest;
import org.example.glacierdisasterbackend.repository.RescueOperationRepository;
import org.example.glacierdisasterbackend.repository.SosRequestRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RescueOperationService {

    private final RescueOperationRepository rescueOperationRepository;
    private final SosRequestRepository sosRequestRepository;

    public RescueOperationService(
            RescueOperationRepository rescueOperationRepository,
            SosRequestRepository sosRequestRepository) {

        this.rescueOperationRepository = rescueOperationRepository;
        this.sosRequestRepository = sosRequestRepository;
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

        if (rescueOperation.getSosRequestId() != null) {

            SosRequest sosRequest =
                    sosRequestRepository
                            .findById(rescueOperation.getSosRequestId())
                            .orElseThrow(() ->
                                    new RuntimeException("SOS request not found"));

            sosRequest.setStatus("ASSIGNED");

            sosRequestRepository.save(sosRequest);
        }

        return rescueOperationRepository.save(rescueOperation);
    }

    public List<RescueOperation> getAllRescueOperations() {
        return rescueOperationRepository.findAll();
    }

    // Update rescue operation status
    public RescueOperation updateStatus(
            String id,
            String status) {

        RescueOperation operation =
                rescueOperationRepository.findById(id)
                        .orElseThrow(() ->
                                new RuntimeException(
                                        "Rescue operation not found"));

        operation.setStatus(status);

        if (status.equalsIgnoreCase("COMPLETED")) {
            operation.setCompletedTime(LocalDateTime.now());
        }

        return rescueOperationRepository.save(operation);
    }
}