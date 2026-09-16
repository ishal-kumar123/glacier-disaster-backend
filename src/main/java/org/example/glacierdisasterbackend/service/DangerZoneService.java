package org.example.glacierdisasterbackend.service;

import org.example.glacierdisasterbackend.model.DangerZone;
import org.example.glacierdisasterbackend.repository.DangerZoneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DangerZoneService {

    private final DangerZoneRepository dangerZoneRepository;

    public DangerZoneService(DangerZoneRepository dangerZoneRepository) {
        this.dangerZoneRepository = dangerZoneRepository;
    }

    public DangerZone saveDangerZone(DangerZone dangerZone) {
        return dangerZoneRepository.save(dangerZone);
    }

    public List<DangerZone> getAllDangerZones() {
        return dangerZoneRepository.findAll();
    }
}