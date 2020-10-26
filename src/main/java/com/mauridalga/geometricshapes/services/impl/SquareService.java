package com.mauridalga.geometricshapes.services.impl;

import com.mauridalga.geometricshapes.domain.Square;
import com.mauridalga.geometricshapes.domain.logic.GeometricShapeLogic;
import com.mauridalga.geometricshapes.domain.logic.factory.GeometricShapeLogicFactory;
import com.mauridalga.geometricshapes.models.SquareDTO;
import com.mauridalga.geometricshapes.repositories.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class SquareService extends BaseService<Square, SquareDTO> {

    @Autowired
    public SquareService(IRepository<Square> repository, GeometricShapeLogicFactory logicFactory) {
        super(repository, logicFactory);
    }

    @Override
    protected Square makeEntity(SquareDTO squareDTO) {
        GeometricShapeLogic squareLogic = logicFactory.create(squareDTO);
        Square square = new Square();
        square.setBase(squareLogic.getBase());
        square.setHeight(squareLogic.getHeight());
        square.setArea(squareLogic.getArea());
        square.setType(squareLogic.getGeometricShapeType());
        return square;
    }
}
