package org.example.glacierdisasterbackend.controller;

import org.example.glacierdisasterbackend.model.SosRequest;
import org.example.glacierdisasterbackend.service.SosRequestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sos")
@CrossOrigin(origins = "http://localhost:4200")
public class SosRequestController {

    private final SosRequestService sosRequestService;

    public SosRequestController(SosRequestService sosRequestService) {
        this.sosRequestService = sosRequestService;
    }

    @PostMapping
    public ResponseEntity<SosRequest> createSosRequest(
            @RequestBody SosRequest sosRequest) {

        return ResponseEntity.ok(
                sosRequestService.createSosRequest(sosRequest)
        );
    }

    @GetMapping
    public ResponseEntity<List<SosRequest>> getAllSosRequests() {

        return ResponseEntity.ok(
                sosRequestService.getAllSosRequests()
        );
    }
}