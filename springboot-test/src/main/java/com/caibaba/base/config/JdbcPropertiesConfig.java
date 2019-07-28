//package com.caibaba.base.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import lombok.Data;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//
//
///**
// * 使用springboot方式演示
// */
//
//@ConfigurationProperties(prefix = "jdbc")
//@Data
////@Component 直接加这个，就相当于注册到spring了，那么其他类肯定能注入用
////另一种方式是在要用的配置类上，指明引用这个配置属性的类
//public class JdbcPropertiesConfig {
//    private String driver;
//    private  String username;
//    private  String password;
//    private  String url;
//
//
//}
