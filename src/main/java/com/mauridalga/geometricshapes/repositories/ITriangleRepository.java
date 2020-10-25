package com.mauridalga.geometricshapes.repositories;

import com.mauridalga.geometricshapes.domain.Triangle;

import java.util.List;
import java.util.Optional;

public interface ITriangleRepository {
    List<Triangle> getAll();

    Triangle insert(Triangle triangle);

    Triangle update(Triangle triangle);

    Optional<Triangle> findById(String id);

    void deleteById(String id);
}
