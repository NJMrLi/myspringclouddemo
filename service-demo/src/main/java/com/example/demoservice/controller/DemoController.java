package com.example.demoservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/demo")
public class DemoController {

    @Value("${server.port}" )
    private String port;

    @GetMapping("hello")
    public String hello(@RequestParam String name){
        return "端口:"+ port + "Hello " + name ;
    }

}
