package com.mauridalga.geometricshapes.services.impl;

import com.mauridalga.geometricshapes.domain.Square;
import com.mauridalga.geometricshapes.domain.logic.GeometricShapeLogic;
import com.mauridalga.geometricshapes.domain.logic.factory.GeometricShapeLogicFactory;
import com.mauridalga.geometricshapes.models.SquareDTO;
import com.mauridalga.geometricshapes.repositories.ISquareRepository;
import com.mauridalga.geometricshapes.services.ISquareService;
import org.springframework.stereotype.Service;

import java.util.List;

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
