package com.example.servicespringcloudgateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    /**
     * @param builder
     * @return
     */
    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        String httpUri = "http://httpbin.org:80";
        // RouteLocatorBuilder去创建路由
        // predicates断言的意思，顾名思义就是根据具体的请求的规则，由具体的route去处理，filters是各种过滤器，用来对请求做各种判断和修改。
        return builder.routes()
                // 上面创建的route可以让请求“/get”请求都转发到“http://httpbin.org/get”。
                // 在route配置上，我们添加了一个filter，该filter会将请求添加一个header,key为hello，value为world。
                // httpbin.org 这个网站能测试 HTTP 请求和响应的各种信息，比如 cookie、ip、headers 和登录验证等，
                // 且支持 GET、POST 等多种方法，对 web 开发和测试很有帮助。
                .route( p -> p
                        .path( "/get" )
                        .filters( f -> f.addRequestHeader( "Hello", "World" ) )
                        .uri( httpUri ) )
                .route( p -> p
                        .host( "*.hystrix.com" )
                        .filters( f -> f
                                .hystrix( config -> config
                                        .setName( "mycmd" )
                                        .setFallbackUri( "forward:/fallback" ) ) )
                        .uri( httpUri ) )
                .build();
    }

}
