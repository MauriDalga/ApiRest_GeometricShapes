package com.mauridalga.geometricshapes.domain.logic.factory.impl;

import com.mauridalga.geometricshapes.domain.logic.*;
import com.mauridalga.geometricshapes.domain.logic.factory.GeometricShapeLogicFactory;
import com.mauridalga.geometricshapes.models.CircleDTO;
import com.mauridalga.geometricshapes.models.GeometricShapeDTO;
import com.mauridalga.geometricshapes.models.SquareDTO;
import com.mauridalga.geometricshapes.models.TriangleDTO;
import org.springframework.stereotype.Component;

@Component
class GeometricShapeLogicConcreteFactory implements GeometricShapeLogicFactory {
    @Override
    public GeometricShapeLogic create(GeometricShapeDTO geometricShapeDTO) {
        if (geometricShapeDTO instanceof CircleDTO) {
            CircleDTO circleDTO = (CircleDTO) geometricShapeDTO;
            return new CircleLogic(circleDTO.getRadius());

        } else if (geometricShapeDTO instanceof TriangleDTO) {
            TriangleDTO triangleDTO = (TriangleDTO) geometricShapeDTO;
            return new TriangleLogic(triangleDTO.getBase(), triangleDTO.getSide1(), triangleDTO.getSide2());

        } else if (geometricShapeDTO instanceof SquareDTO) {
            SquareDTO squareDTO = (SquareDTO) geometricShapeDTO;
            return new SquareLogic(squareDTO.getBase());

        }
        return new DummyGeometricLogic();
    }
}
