package com.example.servicefeign.controller;

import com.example.servicefeign.service.IDemoServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("web/hello")
public class HelloController {

    @Autowired
    public IDemoServiceClient demoServiceClient;

    @GetMapping("/say")
    public String sayHello(@RequestParam String name){
        String result = demoServiceClient.sayHello( name );
        return "Feign: " + result;
    }


}
