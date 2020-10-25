package com.mauridalga.geometricshapes.domain.logic.factory;

import com.mauridalga.geometricshapes.domain.logic.GeometricShapeLogic;
import com.mauridalga.geometricshapes.domain.logic.GeometricShapeType;

import java.math.BigDecimal;

public interface GeometricShapeLogicFactory {
    GeometricShapeLogic create(GeometricShapeType type, Double... args);
}
