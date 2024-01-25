package com.example.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHelloWorld(){
        return "Hello World";
    }

    //expose a new endpoint for workout
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "DEVTOLL1";
    }
}
