package com.mauridalga.geometricshapes.domain.logic.factory;

import com.mauridalga.geometricshapes.domain.logic.GeometricShapeLogic;
import com.mauridalga.geometricshapes.models.GeometricShapeDTO;

public interface GeometricShapeLogicFactory {
    GeometricShapeLogic create(GeometricShapeDTO geometricShapeDTO);
}
