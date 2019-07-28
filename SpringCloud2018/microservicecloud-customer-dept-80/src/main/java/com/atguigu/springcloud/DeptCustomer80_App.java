package com.atguigu.springcloud;

import myribbonrule.MySelfRule;
import myribbonrule.RandomRule_LBH;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//这里就不添加启动eureka发现，都是调用服务提供者的
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = RandomRule_LBH.class)//指定是消费者微服务对那个提供的微服务负载均衡和使用那个负载均衡算法
public class DeptCustomer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptCustomer80_App.class,args);
    }
}
