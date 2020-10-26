package com.mauridalga.geometricshapes.domain.logic;

public class SquareLogic implements GeometricShapeLogic {
    private final Double base;

    public SquareLogic(Double base) {
        this.base = base;
    }

    @Override
    public Double getArea() {
        return GeometricMathsUtil.calculateSquareArea(base);
    }

    @Override
    public Double getBase() {
        return base;
    }

    @Override
    public Double getHeight() {
        return base;
    }

    @Override
    public Double getDiameter() {
        return null;
    }

    @Override
    public GeometricShapeType getGeometricShapeType() {
        return GeometricShapeType.SQUARE;
    }
}
