package com.mauridalga.geometricshapes.repositories.impl;

import com.mauridalga.geometricshapes.domain.IEntity;
import com.mauridalga.geometricshapes.repositories.IRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

abstract class BaseRepository<T extends IEntity> implements IRepository<T> {
    protected final MongoRepository<T, String> mongoRepository;

    public BaseRepository(MongoRepository<T, String> mongoRepository) {
        this.mongoRepository = mongoRepository;
    }

    @Override
    public List<T> getAll() {
        return mongoRepository.findAll();
    }

    @Override
    public T insert(T entity) {
        return mongoRepository.insert(entity);
    }

    @Override
    public T update(T entity) {
        return mongoRepository.save(entity);
    }

    @Override
    public Optional<T> findById(String id) {
        return mongoRepository.findById(id);
    }

    @Override
    public void deleteById(String id) {
        mongoRepository.deleteById(id);
    }
}
