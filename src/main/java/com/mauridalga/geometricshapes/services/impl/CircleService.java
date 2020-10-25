package com.mauridalga.geometricshapes.services.impl;

import com.mauridalga.geometricshapes.domain.Circle;
import com.mauridalga.geometricshapes.domain.logic.GeometricShapeLogic;
import com.mauridalga.geometricshapes.domain.logic.GeometricShapeType;
import com.mauridalga.geometricshapes.domain.logic.factory.GeometricShapeLogicFactory;
import com.mauridalga.geometricshapes.models.CircleDTO;
import com.mauridalga.geometricshapes.repositories.ICircleRepository;
import com.mauridalga.geometricshapes.services.ICircleService;
import com.mauridalga.geometricshapes.services.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public List<Circle> getAll() {
        return repository.getAll();
    }

    @Override
    public Circle create(CircleDTO circleDTO) {
        Circle circle = makeCircle(circleDTO);
        return repository.insert(circle);
    }

    @Override
    public Circle update(String id, CircleDTO circleDTO) {
        Optional<Circle> circleOptional = repository.findById(id);
        if (circleOptional.isEmpty()) {
            throw new EntityNotFoundException(String.format("Circle whit id:'{%s}' not found", id));
        }

        Circle circle = makeCircle(circleDTO);
        circle.setId(id);
        return repository.save(circle);
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
