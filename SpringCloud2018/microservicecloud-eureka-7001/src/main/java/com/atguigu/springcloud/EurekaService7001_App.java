package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//启动服务端，接收其他微服务client端注册进来
public class EurekaService7001_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaService7001_App.class,args);
    }
}
