package com.mauridalga.geometricshapes.repositories;

import com.mauridalga.geometricshapes.domain.Square;

import java.util.List;
import java.util.Optional;

public interface ISquareRepository {
    List<Square> getAll();

    Square insert(Square square);

    Optional<Square> findById(String id);

    Square update(Square square);

    void deleteById(String id);
}
