package com.allstate.controllers;

import com.allstate.models.LinearEquation;
import com.allstate.models.LinearEquation;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LinearEquationController {
    @RequestMapping(value="/linear/distance", method = RequestMethod.POST)
    public Map<String,Double> distance(@RequestBody List<LinearEquation> points){
        double result = LinearEquation.distance(points);
        Map<String,Double> map = new HashMap<>();
        map.put("distance", result);
        return map;
    }
}
