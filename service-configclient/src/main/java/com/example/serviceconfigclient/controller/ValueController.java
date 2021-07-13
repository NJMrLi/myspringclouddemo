package com.example.serviceconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestMapping("/web/value")
@Scope("prototype")
public class ValueController {

    @Value( "${foo}" )
    String foo;

    @Value( "${bigorange}" )
    String bigorange;

    @GetMapping("get")
    public String getValue(@RequestParam String valueName){
        if(valueName.equals( "foo" )){
            return foo;
        }
        if(valueName.equals( "bigorange" )){
            return bigorange;
        }
        return "未找到对应配置";
    }
}


