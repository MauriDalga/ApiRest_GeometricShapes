package com.mauridalga.geometricshapes.repositories.impl;

import com.mauridalga.geometricshapes.domain.Circle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CircleMongoRepository extends MongoRepository<Circle, String> {
}
