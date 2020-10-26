package com.mauridalga.geometricshapes.controllers;

import com.mauridalga.geometricshapes.domain.Triangle;
import com.mauridalga.geometricshapes.models.TriangleDTO;
import com.mauridalga.geometricshapes.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/triangles")
public class TriangleController extends BaseController<Triangle, TriangleDTO> {

    @Autowired
    public TriangleController(IService<Triangle, TriangleDTO> service) {
        super(service);
    }
}
