package com.project.docker_devtools.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevToolsController {


    @GetMapping
    public String helloWorld(){

        return "Hello Lamark!";
    }


}
