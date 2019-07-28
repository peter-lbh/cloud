package com.atguigu.springcloud.controller;
/**
 * 演示feign负载均衡的面向接口思想
 */

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.IDeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController_Customer_Feign {
    /**
     * 也是controller里调用service....
     * 还要在主启动类启动Feign
     * feign 默认轮询
     */
    @Autowired
    private IDeptClientService clientService;//feign注解的接口要注入成功在主启动类上必须开启feign服务！！

    @RequestMapping("/customer/dept/insert")
    public Integer insert(Dept dept){
       return this.clientService.insert(dept);
    }
    @RequestMapping("/customer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return this.clientService.get(id);
    }
    @RequestMapping("/customer/dept/list")
    @SuppressWarnings("unchecked")//下面以后泛型警告，这里不警告
    public List<Dept> getAll(){
        return this.clientService.getAll();
    }
    @RequestMapping("/customer/dept/discovery")
    public Object discovery(){
        return this.clientService.discovery();
    }
}
