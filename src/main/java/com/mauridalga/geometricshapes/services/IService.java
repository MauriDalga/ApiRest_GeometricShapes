package com.mauridalga.geometricshapes.services;

import com.mauridalga.geometricshapes.domain.IEntity;
import com.mauridalga.geometricshapes.models.GeometricShapeDTO;

import java.util.List;

public interface IService<T extends IEntity, V extends GeometricShapeDTO> {
    List<T> getAll();

    T create(V geometricShapeDto);

    T updateById(String id, V geometricShapeDto);

    void deleteById(String id);
}
