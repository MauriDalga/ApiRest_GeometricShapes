package com.mauridalga.geometricshapes.repositories.impl;

import com.mauridalga.geometricshapes.domain.Triangle;
import com.mauridalga.geometricshapes.repositories.ITriangleRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
class TriangleRepository implements ITriangleRepository {
    private final TriangleMongoRepository mongoRepository;

    public TriangleRepository(TriangleMongoRepository mongoRepository) {
        this.mongoRepository = mongoRepository;
    }

    @Override
    public List<Triangle> getAll() {
        return mongoRepository.findAll();
    }

    @Override
    public Triangle insert(Triangle triangle) {
        return mongoRepository.insert(triangle);
    }

    @Override
    public Triangle update(Triangle triangle) {
        return mongoRepository.save(triangle);
    }

    @Override
    public Optional<Triangle> findById(String id) {
        return mongoRepository.findById(id);
    }

    @Override
    public void deleteById(String id) {
        mongoRepository.deleteById(id);
    }
}
