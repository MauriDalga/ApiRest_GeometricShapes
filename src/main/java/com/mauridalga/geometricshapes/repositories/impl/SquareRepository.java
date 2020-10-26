package com.mauridalga.geometricshapes.repositories.impl;

import com.mauridalga.geometricshapes.domain.Square;
import com.mauridalga.geometricshapes.repositories.ISquareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
class SquareRepository implements ISquareRepository {
    private final SquareMongoRepository mongoRepository;

    @Autowired
    public SquareRepository(SquareMongoRepository mongoRepository) {
        this.mongoRepository = mongoRepository;
    }

    @Override
    public List<Square> getAll() {
        return mongoRepository.findAll();
    }

    @Override
    public Square insert(Square square) {
        return mongoRepository.insert(square);
    }
}
