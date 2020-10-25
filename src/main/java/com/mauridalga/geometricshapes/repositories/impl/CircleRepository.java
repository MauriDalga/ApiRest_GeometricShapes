package com.mauridalga.geometricshapes.repositories.impl;

import com.mauridalga.geometricshapes.domain.Circle;
import com.mauridalga.geometricshapes.repositories.ICircleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
class CircleRepository implements ICircleRepository {
    private final CircleMongoRepository mongoRepository;

    @Autowired
    public CircleRepository(CircleMongoRepository mongoRepository) {
        this.mongoRepository = mongoRepository;
    }

    @Override
    public List<Circle> getAll() {
        return mongoRepository.findAll();
    }

    @Override
    public Circle insert(Circle circle) {
        return mongoRepository.insert(circle);
    }

    @Override
    public Optional<Circle> findById(String id) {
        return mongoRepository.findById(id);
    }

    @Override
    public Circle update(Circle circle) {
        return mongoRepository.save(circle);
    }

    @Override
    public void deleteById(String id) {
        mongoRepository.deleteById(id);
    }
}
