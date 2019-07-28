package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@MapperScan(basePackages ="com.atguigu.springcloud.dao")
@EnableEurekaClient
@EnableDiscoveryClient
//@EnableHystrix//开启断路器
@EnableCircuitBreaker//开启熔断机制的注解
public class DeptProvider8081_App_Hystrix {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8081_App_Hystrix.class,args);
    }
}
