package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController_Customer {
    //定义rest访问的那个服务的地址---下面演示都是真正实现微服务之间通过微服务名经行访问
//    private static final String URL_DEPT_PROVIDER_PREFIX = "http://localhost:8081";
    private static final String URL_DEPT_PROVIDER_PREFIX = "http://MICROSERVICECLOUD-DEPT";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/customer/dept/insert")
    public Integer insert(Dept dept){
        //三个参数分别对应 1.访问的restful接口地址 2.传入的参数（object）即任何类型 3.返回值类型的类对象
        return this.restTemplate.postForObject(URL_DEPT_PROVIDER_PREFIX+"/dept/insert",dept,Integer.class);
    }
    @RequestMapping("/customer/dept/get/{id}")
    public Dept get(@PathVariable Long id){
        return this.restTemplate.getForObject(URL_DEPT_PROVIDER_PREFIX+"/dept/get/"+id,Dept.class);
    }
    @RequestMapping("/customer/dept/list")
    @SuppressWarnings("unchecked")//下面以后泛型警告，这里不警告
    public List<Dept> getAll(){
        return this.restTemplate.getForObject(URL_DEPT_PROVIDER_PREFIX+"/dept/list",List.class);
    }
    @RequestMapping("/customer/dept/discovery")
    public Object discovery(){
        return this.restTemplate.getForObject(URL_DEPT_PROVIDER_PREFIX+"/dept/discovery",Object.class);
    }
}
