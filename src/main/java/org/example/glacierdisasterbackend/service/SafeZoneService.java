package org.example.glacierdisasterbackend.service;

import org.example.glacierdisasterbackend.model.SafeZone;
import org.example.glacierdisasterbackend.repository.SafeZoneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SafeZoneService {

    private final SafeZoneRepository safeZoneRepository;

    public SafeZoneService(SafeZoneRepository safeZoneRepository) {
        this.safeZoneRepository = safeZoneRepository;
    }

    public SafeZone saveSafeZone(SafeZone safeZone) {
        return safeZoneRepository.save(safeZone);
    }

    public List<SafeZone> getAllSafeZones() {
        return safeZoneRepository.findAll();
    }
}