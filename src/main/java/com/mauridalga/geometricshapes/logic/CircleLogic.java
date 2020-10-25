package com.mauridalga.geometricshapes.logic;

public class CircleLogic implements GeometricShapeLogic {
    private final Double radius;

    public CircleLogic(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
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
