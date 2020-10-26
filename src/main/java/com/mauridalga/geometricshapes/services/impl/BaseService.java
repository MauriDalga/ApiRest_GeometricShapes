package com.mauridalga.geometricshapes.services.impl;

import com.mauridalga.geometricshapes.domain.IEntity;
import com.mauridalga.geometricshapes.domain.logic.factory.GeometricShapeLogicFactory;
import com.mauridalga.geometricshapes.models.GeometricShapeDTO;
import com.mauridalga.geometricshapes.repositories.IRepository;
import com.mauridalga.geometricshapes.services.IService;
import com.mauridalga.geometricshapes.services.exceptions.EntityNotFoundException;

import java.util.List;
import java.util.Optional;

abstract class BaseService<T extends IEntity, V extends GeometricShapeDTO> implements IService<T, V> {
    protected final IRepository<T> repository;
    protected final GeometricShapeLogicFactory logicFactory;

    public BaseService(IRepository<T> repository, GeometricShapeLogicFactory logicFactory) {
        this.repository = repository;
        this.logicFactory = logicFactory;
    }

    @Override
    public List<T> getAll() {
        return repository.getAll();
    }

    @Override
    public T create(V geometricShapeDTO) {
        T entity = makeEntity(geometricShapeDTO);
        return repository.insert(entity);
    }

    @Override
    public T updateById(String id, V geometricShapeDTO) {
        validateExistsById(id);
        T entity = makeEntity(geometricShapeDTO);
        entity.setId(id);
        return repository.update(entity);
    }

    @Override
    public void deleteById(String id) {
        validateExistsById(id);
        repository.deleteById(id);
    }

    protected abstract T makeEntity(V geometricShapeDTO);

    private void validateExistsById(String id) {
        Optional<T> entityOptional = repository.findById(id);
        if (entityOptional.isEmpty()) {
            throw new EntityNotFoundException(String.format("Geometric shape with id:'{%s}' not found", id));
        }
    }
}
