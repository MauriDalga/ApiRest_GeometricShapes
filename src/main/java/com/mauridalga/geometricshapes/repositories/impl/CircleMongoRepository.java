package com.mauridalga.geometricshapes.repositories.impl;

import com.mauridalga.geometricshapes.models.CircleDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CircleMongoRepository extends MongoRepository<CircleDTO, Long> {
}
