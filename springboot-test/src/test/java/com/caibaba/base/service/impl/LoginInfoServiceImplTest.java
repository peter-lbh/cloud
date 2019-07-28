//package com.caibaba.base.service.impl;
//
//
//import com.caibaba.base.entitys.Department;
//import com.caibaba.base.entitys.LoginInfo;
//import com.caibaba.base.service.ILoginInfoService;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class LoginInfoServiceImplTest {
//    @Autowired
//    private ILoginInfoService loginInfoService;
//
//    @Test
//    public void register() {
//        LoginInfo loginInfo = new LoginInfo();
//        loginInfo.setUsername("王鸣");
//        loginInfo.setHobby("唱跳rep");
//        Department department = new Department();
//        department.setId(2L);
//        loginInfo.setDeptId(department);
//        loginInfo.setPassword("123456");
//        int result =  this.loginInfoService.register(loginInfo);
//        System.out.println(result);
//        Assert.assertNotEquals(0,result);
//    }
//}
