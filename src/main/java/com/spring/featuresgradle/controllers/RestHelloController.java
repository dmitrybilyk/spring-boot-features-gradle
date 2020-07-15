package com.spring.featuresgradle.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHelloController {

    @GetMapping("/getSomeRestValue")
    public String getSomeRestValue() {
        return "get some rest value";
    }
}
