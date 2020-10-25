package com.mauridalga.geometricshapes.domain;

public interface GeometricShape {
    Double getArea();
    Double getBase();
    Double getHeight();
    Double getDiameter();
    GeometricShapeType getGeometricShapeType();
}
