package org.example.glacierdisasterbackend.repository;

import org.example.glacierdisasterbackend.model.Disaster;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DisasterRepository
        extends MongoRepository<Disaster, String> {
}