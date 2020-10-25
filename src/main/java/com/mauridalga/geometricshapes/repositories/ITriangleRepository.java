package com.mauridalga.geometricshapes.repositories;

import com.mauridalga.geometricshapes.domain.Triangle;

import java.util.List;

public interface ITriangleRepository {
    List<Triangle> getAll();

    Triangle insert(Triangle triangle);
}
