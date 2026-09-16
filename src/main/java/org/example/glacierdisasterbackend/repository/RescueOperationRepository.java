package org.example.glacierdisasterbackend.repository;

import org.example.glacierdisasterbackend.model.RescueOperation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RescueOperationRepository
        extends MongoRepository<RescueOperation, String> {
}