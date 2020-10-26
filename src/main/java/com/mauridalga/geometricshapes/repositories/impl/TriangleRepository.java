package com.mauridalga.geometricshapes.repositories.impl;

import com.mauridalga.geometricshapes.domain.Triangle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
class TriangleRepository extends BaseRepository<Triangle> {
    @Autowired
    public TriangleRepository(TriangleMongoRepository mongoRepository) {
        super(mongoRepository);
    }
}
