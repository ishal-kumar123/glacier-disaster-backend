package org.example.glacierdisasterbackend.controller;

import org.example.glacierdisasterbackend.model.SafeZone;
import org.example.glacierdisasterbackend.service.SafeZoneService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/safe-zones")
@CrossOrigin(origins = "http://localhost:4200")
public class SafeZoneController {

    private final SafeZoneService safeZoneService;

    public SafeZoneController(SafeZoneService safeZoneService) {
        this.safeZoneService = safeZoneService;
    }

    @PostMapping
    public ResponseEntity<SafeZone> saveSafeZone(
            @RequestBody SafeZone safeZone) {

        return ResponseEntity.ok(
                safeZoneService.saveSafeZone(safeZone)
        );
    }

    @GetMapping
    public ResponseEntity<List<SafeZone>> getAllSafeZones() {

        return ResponseEntity.ok(
                safeZoneService.getAllSafeZones()
        );
    }
}