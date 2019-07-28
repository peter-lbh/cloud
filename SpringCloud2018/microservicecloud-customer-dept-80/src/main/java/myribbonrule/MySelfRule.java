package myribbonrule;

import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule{
    @Bean
    public IRule myRule() {
        return new RandomRule(); //在这里即可使用自带的负载均衡算法也能自定义，且有特殊性，不会共享给其他模块的消费者微服务
//        return new RetryRule();
//        return new RoundRobinRule();
    }
}