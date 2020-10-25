package com.mauridalga.geometricshapes.services.impl;

import com.mauridalga.geometricshapes.domain.Circle;
import com.mauridalga.geometricshapes.domain.logic.GeometricShapeLogic;
import com.mauridalga.geometricshapes.domain.logic.GeometricShapeType;
import com.mauridalga.geometricshapes.domain.logic.factory.GeometricShapeLogicFactory;
import com.mauridalga.geometricshapes.models.CircleDTO;
import com.mauridalga.geometricshapes.repositories.ICircleRepository;
import com.mauridalga.geometricshapes.services.ICircleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class CircleService implements ICircleService {
    private final ICircleRepository repository;
    private final GeometricShapeLogicFactory logicFactory;

    @Autowired
    public CircleService(ICircleRepository repository, GeometricShapeLogicFactory logicFactory) {
        this.repository = repository;
        this.logicFactory = logicFactory;
    }

    @Override
    public List<Circle> getAllCircles() {
        return repository.getAllCircles();
    }

    @Override
    public Circle createCircle(CircleDTO circleDTO) {
        Circle circle = makeCircle(circleDTO);
        return repository.saveCircle(circle);
    }

    private Circle makeCircle(CircleDTO circleDTO) {
        GeometricShapeLogic circleLogic = logicFactory.create(GeometricShapeType.CIRCLE, circleDTO.getRadius());
        Circle circle = new Circle();
        circle.setRadius(circleDTO.getRadius());
        circle.setArea(circleLogic.getArea());
        circle.setDiameter(circleLogic.getDiameter());
        circle.setType(circleLogic.getGeometricShapeType());
        return circle;
    }
}
