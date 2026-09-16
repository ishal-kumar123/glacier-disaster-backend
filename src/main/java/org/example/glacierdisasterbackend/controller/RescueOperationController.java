package org.example.glacierdisasterbackend.controller;

import org.example.glacierdisasterbackend.model.RescueOperation;
import org.example.glacierdisasterbackend.service.RescueOperationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rescue-operations")
@CrossOrigin(origins = "http://localhost:4200")
public class RescueOperationController {

    private final RescueOperationService rescueOperationService;

    public RescueOperationController(
            RescueOperationService rescueOperationService) {
        this.rescueOperationService = rescueOperationService;
    }

    @PostMapping
    public ResponseEntity<RescueOperation> createRescueOperation(
            @RequestBody RescueOperation rescueOperation) {

        return ResponseEntity.ok(
                rescueOperationService.createRescueOperation(rescueOperation)
        );
    }

    @GetMapping
    public ResponseEntity<List<RescueOperation>> getAllRescueOperations() {

        return ResponseEntity.ok(
                rescueOperationService.getAllRescueOperations()
        );
    }
}