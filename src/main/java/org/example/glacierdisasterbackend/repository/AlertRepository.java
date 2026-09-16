package org.example.glacierdisasterbackend.repository;

import org.example.glacierdisasterbackend.model.Alert;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlertRepository
        extends MongoRepository<Alert, String> {
}