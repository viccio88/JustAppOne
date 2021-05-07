package com.example.justapptwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping(path = "/")
    public String getAny(){
        return "simple text";
    }
}
