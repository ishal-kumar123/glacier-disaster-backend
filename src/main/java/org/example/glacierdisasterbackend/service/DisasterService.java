package org.example.glacierdisasterbackend.service;

import org.example.glacierdisasterbackend.model.Disaster;
import org.example.glacierdisasterbackend.repository.DisasterRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DisasterService {

    private final DisasterRepository disasterRepository;

    public DisasterService(DisasterRepository disasterRepository) {
        this.disasterRepository = disasterRepository;
    }

    public Disaster saveDisaster(Disaster disaster) {

        if (disaster.getStartTime() == null) {
            disaster.setStartTime(LocalDateTime.now());
        }

        return disasterRepository.save(disaster);
    }

    public List<Disaster> getAllDisasters() {
        return disasterRepository.findAll();
    }
}