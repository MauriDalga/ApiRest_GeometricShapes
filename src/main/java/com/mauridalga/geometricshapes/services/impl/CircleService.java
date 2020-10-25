package com.mauridalga.geometricshapes.services.impl;

import com.mauridalga.geometricshapes.models.CircleDTO;
import com.mauridalga.geometricshapes.repositories.ICircleRepository;
import com.mauridalga.geometricshapes.services.ICircleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class CircleService implements ICircleService {
    private final ICircleRepository repository;

    @Autowired
    public CircleService(ICircleRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<CircleDTO> getAllCircles() {
        return repository.getAllCircles();
    }
}
