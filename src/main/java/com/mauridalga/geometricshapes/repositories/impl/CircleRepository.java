package com.mauridalga.geometricshapes.repositories.impl;

import com.mauridalga.geometricshapes.domain.Circle;
import com.mauridalga.geometricshapes.repositories.ICircleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
class CircleRepository implements ICircleRepository {
    private final CircleMongoRepository mongoRepository;

    @Autowired
    public CircleRepository(CircleMongoRepository mongoRepository) {
        this.mongoRepository = mongoRepository;
    }

    @Override
    public List<Circle> getAllCircles() {
        return mongoRepository.findAll();
    }

    @Override
    public Circle saveCircle(Circle circle) {
        return mongoRepository.save(circle);
    }

}
