package com.mauridalga.geometricshapes.domain.logic.factory.impl;

import com.mauridalga.geometricshapes.domain.logic.CircleLogic;
import com.mauridalga.geometricshapes.domain.logic.DummyGeometricLogic;
import com.mauridalga.geometricshapes.domain.logic.GeometricShapeLogic;
import com.mauridalga.geometricshapes.domain.logic.TriangleLogic;
import com.mauridalga.geometricshapes.domain.logic.factory.GeometricShapeLogicFactory;
import com.mauridalga.geometricshapes.models.CircleDTO;
import com.mauridalga.geometricshapes.models.GeometricShapeDTO;
import com.mauridalga.geometricshapes.models.TriangleDTO;
import org.springframework.stereotype.Component;

@Component
class GeometricShapeLogicConcreteFactory implements GeometricShapeLogicFactory {
    @Override
    public GeometricShapeLogic create(GeometricShapeDTO geometricShapeDTO) {
        if(geometricShapeDTO instanceof CircleDTO) {
            CircleDTO circleDTO = (CircleDTO) geometricShapeDTO;
            return new CircleLogic(circleDTO.getRadius());
        } else if (geometricShapeDTO instanceof TriangleDTO) {
            TriangleDTO triangleDTO = (TriangleDTO) geometricShapeDTO;
            return new TriangleLogic(triangleDTO.getBase(), triangleDTO.getSide1(), triangleDTO.getSide2());
        }
        return new DummyGeometricLogic();
    }
}
