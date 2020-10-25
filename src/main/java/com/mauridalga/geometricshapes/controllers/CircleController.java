package com.mauridalga.geometricshapes.controllers;

import com.mauridalga.geometricshapes.domain.Circle;
import com.mauridalga.geometricshapes.models.CircleDTO;
import com.mauridalga.geometricshapes.services.ICircleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/circles")
public class CircleController {
    private final ICircleService service;

    @Autowired
    public CircleController(ICircleService service) {
        this.service = service;
    }

    @GetMapping
    public List<Circle> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Circle create(@Valid @RequestBody CircleDTO circleDTO) {
        return service.create(circleDTO);
    }

    @PutMapping("{id}")
    public Circle update(@PathVariable String id, @Valid @RequestBody CircleDTO circleDTO) {
        return service.updateById(id, circleDTO);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        service.deleteById(id);
    }
}
