package com.mauridalga.geometricshapes.repositories.impl;

import com.mauridalga.geometricshapes.domain.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class CircleRepository extends BaseRepository<Circle> {
    @Autowired
    public CircleRepository(CircleMongoRepository mongoRepository) {
        super(mongoRepository);
    }
}
