package com.example.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableConfigServer
@RefreshScope
public class ServiceConfigServerApplication {

    public static void main(String[] args) {

        SpringApplication.run( ServiceConfigServerApplication.class, args );
        System.out.println("==============配置中心已启动！===========");
    }

}
