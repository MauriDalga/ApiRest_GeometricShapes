package com.mauridalga.geometricshapes.services;

import com.mauridalga.geometricshapes.domain.Circle;
import com.mauridalga.geometricshapes.models.CircleDTO;
import com.mauridalga.geometricshapes.services.exceptions.EntityNotFoundException;

import java.util.List;

public interface ICircleService {
    List<Circle> getAll();

    Circle create(CircleDTO circleDTO);

    Circle update(String id, CircleDTO circleDTO);
}
