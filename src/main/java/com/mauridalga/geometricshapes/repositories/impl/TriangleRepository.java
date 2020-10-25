package com.mauridalga.geometricshapes.repositories.impl;

import com.mauridalga.geometricshapes.domain.Triangle;
import com.mauridalga.geometricshapes.repositories.ITriangleRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

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
}
