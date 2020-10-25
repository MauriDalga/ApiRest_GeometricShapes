package com.mauridalga.geometricshapes.services;

import com.mauridalga.geometricshapes.models.CircleDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ICircleService {
    List<CircleDTO> getCircles();
}
