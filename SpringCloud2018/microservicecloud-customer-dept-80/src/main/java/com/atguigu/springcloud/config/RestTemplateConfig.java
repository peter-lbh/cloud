package com.atguigu.springcloud.config;
/**
 * 注册用于微服务间通讯的rest
 */

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    //在rest的配置类上通过注解加入ribbon配置
    @Bean
    @LoadBalanced//完美体现了ribbon是客户端(配在了消费者即用户的微服务上) 的负载均衡工具---默认轮询
    public RestTemplate getResTemplate(){
        return new RestTemplate();
    }

    /**
     * 在项目@componentscan扫描的包及其子包下以这种方式定义负载均衡的算法，会默认所有微服务都公用该算法
     * 所以自定义负载均衡算法和使用自带的算法都是在主启动类所在包外！！！但是要在主启动类上使用@Ribbonxxx注解引用
     */

//    @Bean
//    public IRule myRule(){
//
////        return new RoundRobinRule();//自带的轮询规则
//        return new RandomRule();//自带的随机规则
//    }
}
