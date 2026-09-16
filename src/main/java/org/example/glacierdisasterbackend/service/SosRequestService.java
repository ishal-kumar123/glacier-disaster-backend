package org.example.glacierdisasterbackend.service;

import org.example.glacierdisasterbackend.model.SosRequest;
import org.example.glacierdisasterbackend.repository.SosRequestRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SosRequestService {

    private final SosRequestRepository sosRequestRepository;

    public SosRequestService(SosRequestRepository sosRequestRepository) {
        this.sosRequestRepository = sosRequestRepository;
    }

    public SosRequest createSosRequest(SosRequest sosRequest) {

        if (sosRequest.getStatus() == null ||
                sosRequest.getStatus().isBlank()) {
            sosRequest.setStatus("PENDING");
        }

        if (sosRequest.getTimestamp() == null) {
            sosRequest.setTimestamp(LocalDateTime.now());
        }

        return sosRequestRepository.save(sosRequest);
    }

    public List<SosRequest> getAllSosRequests() {
        return sosRequestRepository.findAll();
    }
}