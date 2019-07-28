package com.atguigu.springcloud;
/**
 * 演示feign负载均衡以及面向接口思想
 * rebbon和eureka用的是rest实现负载均衡
 *
 * feign也是客户端的负载均衡技术
 * 所以需要建立service层的接口面试，这个service专供客户端使用（取代rest与服务提供者交互1），与deppt+provider里的service是用映射的
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.atguigu.springcloud")
//这里就不添加启动eureka发现，都是调用服务提供者的
public class DeptCustomer80_App_Feign {
    public static void main(String[] args) {
        SpringApplication.run(DeptCustomer80_App_Feign.class,args);
    }
}
