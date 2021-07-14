package com.orange.myeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceEurekaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run( ServiceEurekaserverApplication.class, args );
        System.out.println("============MyeurekaserverApplication 启动了! ==================");
    }

}
