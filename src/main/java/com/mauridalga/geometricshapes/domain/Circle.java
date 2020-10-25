package com.mauridalga.geometricshapes.domain;

import com.mauridalga.geometricshapes.utils.GeometricMathsUtil;

public class Circle implements GeometricShape{
    private Double radius;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return GeometricMathsUtil.calculateCircleDiameter(radius);
    }

    @Override
    public Double getBase() {
        return null;
    }

    @Override
    public Double getHeight() {
        return null;
    }

    @Override
    public Double getDiameter() {
        return GeometricMathsUtil.calculateCircleDiameter(radius);
    }

    @Override
    public GeometricShapeType getGeometricShapeType() {
        return GeometricShapeType.CIRCLE;
    }
}
