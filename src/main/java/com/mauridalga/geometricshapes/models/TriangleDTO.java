package com.mauridalga.geometricshapes.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class TriangleDTO implements GeometricShapeDTO {
    @NotNull
    @Min(0)
    private Double base;

    @NotNull
    @Min(0)
    private Double side1;

    @NotNull
    @Min(0)
    private Double side2;

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getSide1() {
        return side1;
    }

    public void setSide1(Double side1) {
        this.side1 = side1;
    }

    public Double getSide2() {
        return side2;
    }

    public void setSide2(Double side2) {
        this.side2 = side2;
    }
}
