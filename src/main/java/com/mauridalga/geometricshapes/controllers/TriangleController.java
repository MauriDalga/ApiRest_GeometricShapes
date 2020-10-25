package com.mauridalga.geometricshapes.controllers;

import com.mauridalga.geometricshapes.domain.Triangle;
import com.mauridalga.geometricshapes.models.TriangleDTO;
import com.mauridalga.geometricshapes.services.ITriangleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/triangles")
public class TriangleController {
    private final ITriangleService service;

    @Autowired
    public TriangleController(ITriangleService service) {
        this.service = service;
    }

    @GetMapping
    public List<Triangle> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Triangle create(@Valid @RequestBody TriangleDTO triangleDTO) {
        return service.create(triangleDTO);
    }
}
