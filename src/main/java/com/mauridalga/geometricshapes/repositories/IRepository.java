package com.mauridalga.geometricshapes.repositories;

import com.mauridalga.geometricshapes.domain.IEntity;

import java.util.List;
import java.util.Optional;

public interface IRepository<T extends IEntity> {
    List<T> getAll();

    T insert(T t);

    Optional<T> findById(String id);

    T update(T t);

    void deleteById(String id);
}
