package com.atguigu.springcloud.controller;
/**
 * 演示hystrix的服务熔断机制和fallback
 * 在该方法上演示,即每个方法都需要加上熔断后fallback调用的方法--实际开发中是类似aop思想，通过织入...统一配置
 */

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.IDeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class DeptController {
    @Autowired
    private IDeptService deptService;
    @Autowired
    private DiscoveryClient discoveryClient;
//    @PostMapping("/dept/insert")
//    public int insert(@RequestBody Dept dept){
//        int result = this.deptService.insert(dept);
//        log.info("【成功行数:】{}",result);
//        return result;
//    }

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "DEPT_GET_FALLBACK")
    public Dept get(@PathVariable("id") Long id){
        Dept result =  this.deptService.selectById(id);
        if (result==null){
            throw new RuntimeException();
        }
        return result;
    }

    //定义的对应的fallback方法----注意配置fallback回调方，参数要一样
    public Dept DEPT_GET_FALLBACK(@PathVariable("id") Long id){
        return new Dept().setId(100L).setDname("发生了服务熔断").setDbSource("晚点再访问吧！");
    }

//    @GetMapping("/dept/list")
//    public List<Dept> getAll(){
//        return this.deptService.selectAll();
//    }
//
//    @GetMapping("/dept/discovery")
//    public Object discovery(){
//        List<String> serviceName =  this.discoveryClient.getServices();
//        log.info("【服务名称】:{}",serviceName);
//        List<ServiceInstance> serviceInstances =  this.discoveryClient.getInstances("MICROSERVICECLOUD-DEPT");
//        for (ServiceInstance instance:serviceInstances) {
//            System.out.println(instance.getHost()+".."+instance.getServiceId()+"..."+instance.getPort()+"...."+instance.getUri());
//        }
//        return this.discoveryClient;
//    }

}
