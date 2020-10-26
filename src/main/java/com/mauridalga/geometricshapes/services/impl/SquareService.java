package com.mauridalga.geometricshapes.services.impl;

import com.mauridalga.geometricshapes.domain.Square;
import com.mauridalga.geometricshapes.repositories.ISquareRepository;
import com.mauridalga.geometricshapes.services.ISquareService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SquareService implements ISquareService {
    private final ISquareRepository repository;

    public SquareService(ISquareRepository repository) {
        this.repository = repository;
    }
    @Override
    public List<Square> getAll() {
        return repository.getAll();
    }
}
