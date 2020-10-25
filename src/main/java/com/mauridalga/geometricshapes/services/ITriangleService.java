package com.mauridalga.geometricshapes.services;

import com.mauridalga.geometricshapes.domain.Triangle;
import com.mauridalga.geometricshapes.models.TriangleDTO;

import java.util.List;

public interface ITriangleService {
    List<Triangle> getAll();

    Triangle create(TriangleDTO triangleDTO);

    Triangle updateById(String id, TriangleDTO triangleDTO);
}
