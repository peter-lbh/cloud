package com.atguigu.springcloud;
/**
 * 先注册进eureka，获取所有注册进eureka的服务在进行对应的路由分配
 * 配置好的路由测试地址：http://localhost:9527/microservicecloud-dept/dept/get/1
 * 通过映射配置对上述地址进行加密改良成一个对外暴露的地址
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulService9527_App {
    public static void main(String[] args) {
        SpringApplication.run(ZuulService9527_App.class,args);
    }
}
