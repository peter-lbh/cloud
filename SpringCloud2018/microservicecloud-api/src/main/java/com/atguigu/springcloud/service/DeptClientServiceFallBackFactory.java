package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用于统一处理某个服务的所有fallback回调
 * feign和hystrix的整合
 */
@Component//不能省
public class DeptClientServiceFallBackFactory implements FallbackFactory<IDeptClientService> {
    /**
     * 在下面方法中统一处理不同熔断后的备份响应回调
     * @param throwable
     * @return
     */
    @Override
    public IDeptClientService create(Throwable throwable) {
        //利用匿名内部类的思想
        return new IDeptClientService() {
            @Override
            public int insert(Dept dept) {
                return 0;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setId(100L).setDname("发生了服务熔断降级").setDbSource("晚点再访问吧！");
            }

            @Override
            public List<Dept> getAll() {
                return null;
            }

            @Override
            public Object discovery() {
                return null;
            }
        };
    }
}
