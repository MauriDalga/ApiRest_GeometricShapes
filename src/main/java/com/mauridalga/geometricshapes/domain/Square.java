package com.mauridalga.geometricshapes.domain;

import com.mauridalga.geometricshapes.domain.logic.GeometricShapeType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "squares")
public class Square {
    @Id
    private String id;

    private Double base;

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
