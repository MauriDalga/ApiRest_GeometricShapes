package com.mauridalga.geometricshapes.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class SquareDTO implements GeometricShapeDTO {
    @NotNull
    @Min(0)
    private Double base;

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }
}
