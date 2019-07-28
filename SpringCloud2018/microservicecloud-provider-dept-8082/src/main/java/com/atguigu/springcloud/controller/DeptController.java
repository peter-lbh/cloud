package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.IDeptService;
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
    @PostMapping("/dept/insert")
    public int insert(@RequestBody Dept dept){
        int result = this.deptService.insert(dept);
        log.info("【成功行数:】{}",result);
        return result;
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return this.deptService.selectById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> getAll(){
        return this.deptService.selectAll();
    }

    @GetMapping("/dept/discovery")
    public Object discovery(){
        List<String> serviceName =  this.discoveryClient.getServices();
        log.info("【服务名称】:{}",serviceName);
        List<ServiceInstance> serviceInstances =  this.discoveryClient.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance instance:serviceInstances) {
            System.out.println(instance.getHost()+".."+instance.getServiceId()+"...."+instance.getPort()+"...."+instance.getUri());
        }
        return this.discoveryClient;
    }

}
