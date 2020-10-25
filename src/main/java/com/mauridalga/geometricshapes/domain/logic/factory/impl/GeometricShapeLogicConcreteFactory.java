package com.mauridalga.geometricshapes.domain.logic.factory.impl;

import com.mauridalga.geometricshapes.domain.logic.*;
import com.mauridalga.geometricshapes.domain.logic.factory.GeometricShapeLogicFactory;
import org.springframework.stereotype.Component;

@Component
public class GeometricShapeLogicConcreteFactory implements GeometricShapeLogicFactory {
    @Override
    public GeometricShapeLogic create(GeometricShapeType type, Double... args) {
        if(type == GeometricShapeType.CIRCLE) {
            return new CircleLogic(args[0]);
        } else if (type == GeometricShapeType.TRIANGLE) {
            return new TriangleLogic(args[0], args[1], args[2]);
        }
        return new DummyGeometricLogic();
    }
}
