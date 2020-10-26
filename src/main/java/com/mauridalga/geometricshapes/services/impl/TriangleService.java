package com.mauridalga.geometricshapes.services.impl;

import com.mauridalga.geometricshapes.domain.Triangle;
import com.mauridalga.geometricshapes.domain.logic.GeometricShapeLogic;
import com.mauridalga.geometricshapes.domain.logic.factory.GeometricShapeLogicFactory;
import com.mauridalga.geometricshapes.models.TriangleDTO;
import com.mauridalga.geometricshapes.repositories.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class TriangleService extends BaseService<Triangle, TriangleDTO> {

    @Autowired
    public TriangleService(IRepository<Triangle> repository, GeometricShapeLogicFactory logicFactory) {
        super(repository, logicFactory);
    }

    @Override
    protected Triangle makeEntity(TriangleDTO triangleDTO) {
        GeometricShapeLogic triangleLogic = logicFactory.create(triangleDTO);
        Triangle triangle = new Triangle();
        triangle.setBase(triangleDTO.getBase());
        triangle.setSide1(triangleDTO.getSide1());
        triangle.setSide2(triangleDTO.getSide2());
        triangle.setArea(triangleLogic.getArea());
        triangle.setHeight(triangleLogic.getHeight());
        triangle.setType(triangleLogic.getGeometricShapeType());
        return triangle;
    }
}
