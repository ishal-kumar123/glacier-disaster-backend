package org.example.glacierdisasterbackend.controller;

import org.example.glacierdisasterbackend.model.DangerZone;
import org.example.glacierdisasterbackend.service.DangerZoneService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/danger-zones")
@CrossOrigin(origins = "http://localhost:4200")
public class DangerZoneController {

    private final DangerZoneService dangerZoneService;

    public DangerZoneController(DangerZoneService dangerZoneService) {
        this.dangerZoneService = dangerZoneService;
    }

    @PostMapping
    public ResponseEntity<DangerZone> saveDangerZone(
            @RequestBody DangerZone dangerZone) {

        return ResponseEntity.ok(
                dangerZoneService.saveDangerZone(dangerZone)
        );
    }

    @GetMapping
    public ResponseEntity<List<DangerZone>> getAllDangerZones() {

        return ResponseEntity.ok(
                dangerZoneService.getAllDangerZones()
        );
    }
}