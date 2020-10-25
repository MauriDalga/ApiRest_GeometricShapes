package com.mauridalga.geometricshapes.services.impl;

import com.mauridalga.geometricshapes.domain.Triangle;
import com.mauridalga.geometricshapes.domain.logic.GeometricShapeLogic;
import com.mauridalga.geometricshapes.domain.logic.factory.GeometricShapeLogicFactory;
import com.mauridalga.geometricshapes.models.TriangleDTO;
import com.mauridalga.geometricshapes.repositories.ITriangleRepository;
import com.mauridalga.geometricshapes.services.ITriangleService;
import com.mauridalga.geometricshapes.services.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
class TriangleService implements ITriangleService {
    private final ITriangleRepository repository;
    private final GeometricShapeLogicFactory logicFactory;

    @Autowired
    public TriangleService(ITriangleRepository repository, GeometricShapeLogicFactory logicFactory) {
        this.repository = repository;
        this.logicFactory = logicFactory;
    }

    @Override
    public List<Triangle> getAll() {
        return repository.getAll();
    }

    @Override
    public Triangle create(TriangleDTO triangleDTO) {
        Triangle triangle = makeTriangle(triangleDTO);
        return repository.insert(triangle);
    }

    @Override
    public Triangle updateById(String id, TriangleDTO triangleDTO) {
        validateExistsById(id);
        Triangle triangle = makeTriangle(triangleDTO);
        triangle.setId(id);
        return repository.update(triangle);
    }

    @Override
    public void deleteById(String id) {
        validateExistsById(id);
        repository.deleteById(id);
    }

    private void validateExistsById(String id) {
        Optional<Triangle> triangleOptional = repository.findById(id);
        if (triangleOptional.isEmpty()) {
            throw new EntityNotFoundException(String.format("Triangle with id:'{%s}' not found", id));
        }
    }

    private Triangle makeTriangle(TriangleDTO triangleDTO) {
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
