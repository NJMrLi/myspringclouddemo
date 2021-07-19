package com.example.servicespringcloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceSpringcloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run( ServiceSpringcloudGatewayApplication.class, args );
        System.out.println("========Spring Cloud Gateway 启动了！=========");
    }

}
