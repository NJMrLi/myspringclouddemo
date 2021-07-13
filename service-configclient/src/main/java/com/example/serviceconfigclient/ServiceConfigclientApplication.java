package com.example.serviceconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
public class ServiceConfigclientApplication {

    public static void main(String[] args) {
        SpringApplication.run( ServiceConfigclientApplication.class, args );
        System.out.println("============配置中心客户端已启动！=============");
    }

}
