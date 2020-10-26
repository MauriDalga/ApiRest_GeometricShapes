package com.mauridalga.geometricshapes.repositories.impl;

import com.mauridalga.geometricshapes.domain.Square;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
class SquareRepository extends BaseRepository<Square> {
    @Autowired
    public SquareRepository(SquareMongoRepository mongoRepository) {
        super(mongoRepository);
    }
}
