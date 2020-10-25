package com.mauridalga.geometricshapes.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CircleDTO {
    @NotNull
    @Min(0)
    private Double radius;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
