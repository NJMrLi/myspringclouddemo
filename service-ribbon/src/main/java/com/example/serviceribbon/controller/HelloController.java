package com.example.serviceribbon.controller;

import com.example.serviceribbon.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("web/hello")
public class HelloController {

    @Autowired
    public IDemoService demoService;

    @GetMapping("/say")
    public String sayHello(@RequestParam String name){
        String result = demoService.callHelloMethod( name );
        return "Ribbon: " + result;
    }
}
