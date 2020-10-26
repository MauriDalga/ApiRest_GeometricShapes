package com.mauridalga.geometricshapes.repositories;

import com.mauridalga.geometricshapes.domain.Square;

import java.util.List;

public interface ISquareRepository {
    List<Square> getAll();

    Square insert(Square square);
}
