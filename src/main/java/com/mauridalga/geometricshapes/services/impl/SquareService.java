package com.mauridalga.geometricshapes.services.impl;

import com.mauridalga.geometricshapes.domain.Square;
import com.mauridalga.geometricshapes.domain.logic.GeometricShapeLogic;
import com.mauridalga.geometricshapes.domain.logic.factory.GeometricShapeLogicFactory;
import com.mauridalga.geometricshapes.models.SquareDTO;
import com.mauridalga.geometricshapes.repositories.ISquareRepository;
import com.mauridalga.geometricshapes.services.ISquareService;
import com.mauridalga.geometricshapes.services.exceptions.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SquareService implements ISquareService {
    private final ISquareRepository repository;
    private final GeometricShapeLogicFactory logicFactory;

    public SquareService(ISquareRepository repository, GeometricShapeLogicFactory logicFactory) {
        this.repository = repository;
        this.logicFactory = logicFactory;
    }

    @Override
    public List<Square> getAll() {
        return repository.getAll();
    }

    @Override
    public Square create(SquareDTO squareDTO) {
        Square square = makeSquare(squareDTO);
        return repository.insert(square);
    }

    @Override
    public Square updateById(String id, SquareDTO squareDTO) {
        validateExistsById(id);
        Square square = makeSquare(squareDTO);
        square.setId(id);
        return repository.update(square);
    }

    @Override
    public void deleteById(String id) {
        validateExistsById(id);
        repository.deleteById(id);
    }

    private void validateExistsById(String id) {
        Optional<Square> squareOptional = repository.findById(id);
        if (squareOptional.isEmpty()) {
            throw new EntityNotFoundException(String.format("Square with id:'{%s}' not found", id));
        }
    }

    private Square makeSquare(SquareDTO squareDTO) {
        GeometricShapeLogic squareLogic = logicFactory.create(squareDTO);
        Square square = new Square();
        square.setBase(squareLogic.getBase());
        square.setHeight(squareLogic.getHeight());
        square.setArea(squareLogic.getArea());
        square.setType(squareLogic.getGeometricShapeType());
        return square;
    }
}
