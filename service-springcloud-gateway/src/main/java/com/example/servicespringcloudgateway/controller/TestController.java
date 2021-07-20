package com.example.servicespringcloudgateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.ZonedDateTime;
import java.util.Date;

@RestController
public class TestController {

    @RequestMapping("/fallback")
    public Mono<String> fallback() {
        return Mono.justOrEmpty( "我是fallback方法" );
    }


    @RequestMapping("/test")
    public Mono<String> test() {

        ZonedDateTime zonedDateTime=ZonedDateTime.now();
        //输出时区时间
        System.out.println(zonedDateTime);
        return Mono.justOrEmpty( "Time: " + new Date());
    }
}
