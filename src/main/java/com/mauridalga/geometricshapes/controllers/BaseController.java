package com.mauridalga.geometricshapes.controllers;

import com.mauridalga.geometricshapes.domain.IEntity;
import com.mauridalga.geometricshapes.models.GeometricShapeDTO;
import com.mauridalga.geometricshapes.services.IService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

public abstract class BaseController<T extends IEntity, V extends GeometricShapeDTO> {
    protected final IService<T, V> service;

    public BaseController(IService<T, V> service) {
        this.service = service;
    }

    @GetMapping
    public List<T> getAll() {
        return service.getAll();
    }

    @PostMapping
    public T create(@Valid @RequestBody V geometricShapeDTO) {
        return service.create(geometricShapeDTO);
    }

    @PutMapping("{id}")
    public T update(@PathVariable String id, @Valid @RequestBody V geometricShapeDTO) {
        return service.updateById(id, geometricShapeDTO);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        service.deleteById(id);
    }
}
