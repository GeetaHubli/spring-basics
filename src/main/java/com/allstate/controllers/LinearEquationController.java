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

    @RequestMapping(value="/linear/slope", method = RequestMethod.POST)
    public Map<String,Double> slope(@RequestBody List<LinearEquation> points){
        double result = LinearEquation.slope(points);
        Map<String,Double> map = new HashMap<>();
        map.put("slope", result);
        return map;
    }

    @RequestMapping(value="/linear/yIntercept", method = RequestMethod.POST)
    public Map<String,Double> yIntercept(@RequestBody List<LinearEquation> points){
        double result = LinearEquation.yIntercept(points);
        Map<String,Double> map = new HashMap<>();
        map.put("yIntercept", result);
        return map;
    }
}
