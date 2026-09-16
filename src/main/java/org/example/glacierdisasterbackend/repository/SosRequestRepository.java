package org.example.glacierdisasterbackend.repository;

import org.example.glacierdisasterbackend.model.SosRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SosRequestRepository
        extends MongoRepository<SosRequest, String> {
}