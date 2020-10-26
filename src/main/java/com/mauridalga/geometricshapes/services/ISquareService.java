package com.mauridalga.geometricshapes.services;

import com.mauridalga.geometricshapes.domain.Square;
import com.mauridalga.geometricshapes.models.SquareDTO;

import java.util.List;

public interface ISquareService {
    List<Square> getAll();

    Square create(SquareDTO squareDTO);

    Square updateById(String id, SquareDTO squareDTO);
}
