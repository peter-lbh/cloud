package com.atguigu.springcloud;
/**
 * http://localhost:9001/hystrix----刚新建好测试配置的地址
 *
 * 在上述地址上输入需要监控的服务的地址，注意该服务必须使用了hystrix相关的机制，比如熔断机制--http://localhost:8081/hystrix.stream
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashBoard9001_App {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashBoard9001_App.class,args);
    }
}
