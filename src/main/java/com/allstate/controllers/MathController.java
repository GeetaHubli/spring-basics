package com.allstate.controllers;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import com.allstate.models.Math;

@RestController
public class MathController {
    @RequestMapping(value="/math/square/{num}", method = RequestMethod.GET)
    public Map<String, Integer> square(@PathVariable int num){
        int result = Math.square(num);
        Map<String, Integer> map = new HashMap<>();
        map.put("square", result);
        return map;
    }

    @RequestMapping(value="/math/factorial/{num}", method = RequestMethod.GET)
    public Map<String, Integer> factorial(@PathVariable int num){
        int result = Math.factorial(num);
        Map<String, Integer> map = new HashMap<>();
        map.put("original", num);
        map.put("factorial", result);
        return map;
    }

    @RequestMapping(value="/math/fibonacci/{num}", method = RequestMethod.GET)
    public Map<String, Integer> fibonacci(@PathVariable int num){
        int result = Math.fibonacci(num);
        Map<String, Integer> map = new HashMap<>();
        map.put("original", num);
        map.put("fibonacci", result);
        return map;
    }
}
