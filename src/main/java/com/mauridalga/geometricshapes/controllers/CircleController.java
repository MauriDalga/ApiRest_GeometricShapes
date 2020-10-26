package com.mauridalga.geometricshapes.controllers;

import com.mauridalga.geometricshapes.domain.Circle;
import com.mauridalga.geometricshapes.models.CircleDTO;
import com.mauridalga.geometricshapes.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/circles")
public class CircleController extends BaseController<Circle, CircleDTO> {

    @Autowired
    public CircleController(IService<Circle, CircleDTO> service) {
        super(service);
    }
}
