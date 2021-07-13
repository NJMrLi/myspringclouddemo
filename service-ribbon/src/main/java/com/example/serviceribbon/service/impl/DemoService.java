package com.example.serviceribbon.service.impl;

import com.example.serviceribbon.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DemoService implements IDemoService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String callHelloMethod(String name) {
        var result = restTemplate.getForObject("http://DEMOSERVICE/api/demo/hello?name="+name,String.class);
        return result;
    }
}
