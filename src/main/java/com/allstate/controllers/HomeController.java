package com.allstate.controllers;

import com.allstate.models.Hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //Identifies the class as a controller class
public class HomeController {
    @RequestMapping(value="/", method= RequestMethod.GET) //Maps Http request to a function which takes route path and request method types
    public Hello home(){
        Hello h = new Hello("Hello Spring!!");
        return h;
    }
}
