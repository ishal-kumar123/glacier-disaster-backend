package org.example.glacierdisasterbackend.repository;

import org.example.glacierdisasterbackend.model.DangerZone;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DangerZoneRepository
        extends MongoRepository<DangerZone, String> {
}