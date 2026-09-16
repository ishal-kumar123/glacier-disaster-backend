package org.example.glacierdisasterbackend.repository;

import org.example.glacierdisasterbackend.model.SafeZone;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SafeZoneRepository
        extends MongoRepository<SafeZone, String> {
}