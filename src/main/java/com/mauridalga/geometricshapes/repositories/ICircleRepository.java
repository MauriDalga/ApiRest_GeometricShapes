package com.mauridalga.geometricshapes.repositories;

import com.mauridalga.geometricshapes.domain.Circle;

import java.util.List;
import java.util.Optional;

public interface ICircleRepository {
    List<Circle> getAll();

    Circle insert(Circle circle);

    Optional<Circle> findById(String id);

    Circle update(Circle circle);

    void deleteById(String id);
}
