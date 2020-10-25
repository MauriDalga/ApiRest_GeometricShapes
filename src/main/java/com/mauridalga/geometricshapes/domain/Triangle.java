package com.mauridalga.geometricshapes.domain;

import com.mauridalga.geometricshapes.domain.logic.GeometricShapeType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "triangles")
public class Triangle {
    @Id
    private String id;

    private Double base;

    private Double side1;

    private Double side2;

    private Double height;

    private Double area;

    private GeometricShapeType type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
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
