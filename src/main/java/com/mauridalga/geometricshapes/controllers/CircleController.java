package com.mauridalga.geometricshapes.controllers;

import com.mauridalga.geometricshapes.domain.Circle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/circles")
public class CircleController {

    @GetMapping
    public Circle getCircles() {
        return null;
    }
}
