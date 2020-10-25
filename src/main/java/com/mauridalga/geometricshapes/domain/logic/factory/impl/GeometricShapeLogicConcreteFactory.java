package com.mauridalga.geometricshapes.domain.logic.factory.impl;

import com.mauridalga.geometricshapes.domain.logic.CircleLogic;
import com.mauridalga.geometricshapes.domain.logic.DummyGeometricLogic;
import com.mauridalga.geometricshapes.domain.logic.GeometricShapeLogic;
import com.mauridalga.geometricshapes.domain.logic.GeometricShapeType;
import com.mauridalga.geometricshapes.domain.logic.factory.GeometricShapeLogicFactory;
import org.springframework.stereotype.Component;

@Component
public class GeometricShapeLogicConcreteFactory implements GeometricShapeLogicFactory {
    @Override
    public GeometricShapeLogic create(GeometricShapeType type, Double... args) {
        if(type == GeometricShapeType.CIRCLE) {
            return new CircleLogic(args[0]);
        }
        return new DummyGeometricLogic();
    }
}
