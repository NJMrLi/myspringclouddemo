package com.example.sericefeign.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "DEMOSERVICE")
public interface IDemoServiceClient {

    @RequestMapping(value = "/api/demo/hello",method = RequestMethod.GET)
    String sayHello(@RequestParam(value = "name") String name);
}
