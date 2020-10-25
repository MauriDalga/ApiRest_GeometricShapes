package com.mauridalga.geometricshapes.controllers;

import com.mauridalga.geometricshapes.models.CircleDTO;
import com.mauridalga.geometricshapes.services.ICircleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<CircleDTO> getCircles() {
        return service.getCircles();
    }
}
