package com.mauridalga.geometricshapes.repositories.impl;

import com.mauridalga.geometricshapes.domain.Square;
import org.springframework.data.mongodb.repository.MongoRepository;

interface SquareMongoRepository extends MongoRepository<Square, String> {
}
