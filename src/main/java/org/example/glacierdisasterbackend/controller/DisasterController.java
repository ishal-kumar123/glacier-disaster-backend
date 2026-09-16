package org.example.glacierdisasterbackend.controller;

import org.example.glacierdisasterbackend.model.Disaster;
import org.example.glacierdisasterbackend.service.DisasterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/disasters")
@CrossOrigin(origins = "http://localhost:4200")
public class DisasterController {

    private final DisasterService disasterService;

    public DisasterController(DisasterService disasterService) {
        this.disasterService = disasterService;
    }

    @PostMapping
    public ResponseEntity<Disaster> saveDisaster(
            @RequestBody Disaster disaster) {

        return ResponseEntity.ok(
                disasterService.saveDisaster(disaster)
        );
    }

    @GetMapping
    public ResponseEntity<List<Disaster>> getAllDisasters() {

        return ResponseEntity.ok(
                disasterService.getAllDisasters()
        );
    }
}