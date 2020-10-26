package com.mauridalga.geometricshapes.controllers;

import com.mauridalga.geometricshapes.domain.Square;
import com.mauridalga.geometricshapes.models.SquareDTO;
import com.mauridalga.geometricshapes.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/squares")
public class SquareController extends BaseController<Square, SquareDTO> {

    @Autowired
    public SquareController(IService<Square, SquareDTO> service) {
        super(service);
    }
}
