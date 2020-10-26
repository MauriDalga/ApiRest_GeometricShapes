package com.mauridalga.geometricshapes.controllers;

import com.mauridalga.geometricshapes.domain.Square;
import com.mauridalga.geometricshapes.models.SquareDTO;
import com.mauridalga.geometricshapes.services.ISquareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @PostMapping
    public Square create(@Valid @RequestBody SquareDTO squareDTO) {
        return service.create(squareDTO);
    }

    @PutMapping("{id}")
    public Square update(@PathVariable String id, @Valid @RequestBody SquareDTO squareDTO) {
        return service.updateById(id, squareDTO);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        service.deleteById(id);
    }
}
