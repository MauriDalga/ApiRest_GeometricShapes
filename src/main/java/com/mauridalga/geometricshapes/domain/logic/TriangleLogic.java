package com.mauridalga.geometricshapes.domain.logic;

public class TriangleLogic implements GeometricShapeLogic {
    private final Double base;
    private final Double side1;
    private final Double side2;

    public TriangleLogic(Double base, Double side1, Double side2) {
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public Double getArea() {
        return GeometricMathsUtil.calculateTriangleArea(base, side1, side2);
    }

    @Override
    public Double getBase() {
        return base;
    }

    @Override
    public Double getHeight() {
        return GeometricMathsUtil.calculateTriangleHeight(base, side1, side2);
    }

    @Override
    public Double getDiameter() {
        return null;
    }

    @Override
    public GeometricShapeType getGeometricShapeType() {
        return GeometricShapeType.TRIANGLE;
    }
}
