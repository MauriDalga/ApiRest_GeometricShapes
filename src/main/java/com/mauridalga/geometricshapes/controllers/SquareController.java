package com.mauridalga.geometricshapes.controllers;

import com.mauridalga.geometricshapes.domain.Square;
import com.mauridalga.geometricshapes.services.ISquareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/squares")
public class SquareController {
    private final ISquareService service;

    @Autowired
    public SquareController(ISquareService service) {
        this.service = service;
    }

    @GetMapping
    public List<Square> getAll() {
        return service.getAll();
    }
}
