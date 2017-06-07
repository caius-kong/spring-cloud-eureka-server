package com.kyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by kongyunhui on 2017/6/7.
 */
@SpringBootApplication
@EnableEurekaServer // 启用服务注册中心，作为Eureka服务器 (Feign是一个声明式Web Service客户端)
public class SpringCloudEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServerApplication.class, args);
    }
}
