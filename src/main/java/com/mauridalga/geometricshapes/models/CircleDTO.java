package com.mauridalga.geometricshapes.models;

import com.mauridalga.geometricshapes.logic.GeometricShapeType;

public class CircleDTO {
    private Long id;

    private Double radius;

    private Double diameter;

    private Double area;

    private GeometricShapeType type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public GeometricShapeType getType() {
        return type;
    }

    public void setType(GeometricShapeType type) {
        this.type = type;
    }
}
