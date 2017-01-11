package com.allstate.controllers;

import com.allstate.models.Triangle;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TriangleController {

    @RequestMapping(value="/triangle/area", method = RequestMethod.POST)
    public Map<String,Double> area(@RequestBody List<Triangle> triangles){
        double result = Triangle.area(triangles);
        Map<String,Double> map = new HashMap<>();
        map.put("area", result);
        return map;
    }
}
