package com.mauridalga.geometricshapes.services.impl;

import com.mauridalga.geometricshapes.domain.Circle;
import com.mauridalga.geometricshapes.domain.logic.GeometricShapeLogic;
import com.mauridalga.geometricshapes.domain.logic.factory.GeometricShapeLogicFactory;
import com.mauridalga.geometricshapes.models.CircleDTO;
import com.mauridalga.geometricshapes.repositories.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class CircleService extends BaseService<Circle, CircleDTO> {

    @Autowired
    public CircleService(IRepository<Circle> repository, GeometricShapeLogicFactory logicFactory) {
        super(repository, logicFactory);
    }

    @Override
    protected Circle makeEntity(CircleDTO circleDTO) {
        GeometricShapeLogic circleLogic = logicFactory.create(circleDTO);
        Circle circle = new Circle();
        circle.setRadius(circleDTO.getRadius());
        circle.setArea(circleLogic.getArea());
        circle.setDiameter(circleLogic.getDiameter());
        circle.setType(circleLogic.getGeometricShapeType());
        return circle;
    }
}
