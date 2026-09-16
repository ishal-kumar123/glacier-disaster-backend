package org.example.glacierdisasterbackend.controller;

import org.example.glacierdisasterbackend.model.RescueStation;
import org.example.glacierdisasterbackend.service.RescueStationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rescue-stations")
@CrossOrigin(origins = "http://localhost:4200")
public class RescueStationController {

    private final RescueStationService rescueStationService;

    public RescueStationController(RescueStationService rescueStationService) {
        this.rescueStationService = rescueStationService;
    }

    @PostMapping
    public ResponseEntity<RescueStation> saveRescueStation(
            @RequestBody RescueStation rescueStation) {

        return ResponseEntity.ok(
                rescueStationService.saveRescueStation(rescueStation)
        );
    }

    @GetMapping
    public ResponseEntity<List<RescueStation>> getAllRescueStations() {

        return ResponseEntity.ok(
                rescueStationService.getAllRescueStations()
        );
    }
}