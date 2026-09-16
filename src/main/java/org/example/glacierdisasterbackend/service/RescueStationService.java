package org.example.glacierdisasterbackend.service;

import org.example.glacierdisasterbackend.model.RescueStation;
import org.example.glacierdisasterbackend.repository.RescueStationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RescueStationService {

    private final RescueStationRepository rescueStationRepository;

    public RescueStationService(RescueStationRepository rescueStationRepository) {
        this.rescueStationRepository = rescueStationRepository;
    }

    public RescueStation saveRescueStation(RescueStation rescueStation) {
        return rescueStationRepository.save(rescueStation);
    }

    public List<RescueStation> getAllRescueStations() {
        return rescueStationRepository.findAll();
    }
}