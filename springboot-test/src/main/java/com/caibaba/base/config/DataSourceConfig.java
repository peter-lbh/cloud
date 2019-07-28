//package com.caibaba.base.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.*;
//
///**
// * 使用spring原始的文件配置方式注入属性，只不过使用了注解
// * 和演示springboot注入方式---一共三种方式
// */
//@Configuration
////@PropertySource("classpath:jdbc.properties")
//@EnableConfigurationProperties({JdbcPropertiesConfig.class})//这种方式也鞥用autowired
//public class DataSourceConfig {
//    @Autowired
//    private JdbcPropertiesConfig config;
////    @Value("${jdbc.driver}")
//////    private String driver;
//////    @Value("${jdbc.username}")
//////    private  String username;
//////    @Value("${jdbc.password}")
//////    private  String password;
//////    @Value("${jdbc.url}")
//////    private  String url;
//
////    @Bean 参数注入
////    public DruidDataSource getDruidDataBase(JdbcPropertiesConfig config){
////        DruidDataSource druidDataSource = new DruidDataSource();
////        druidDataSource.setDriverClassName(config.getDriver());
////        druidDataSource.setPassword(config.getPassword());
////        druidDataSource.setUrl(config.getUrl());
////        druidDataSource.setUsername(config.getUsername());
////        return druidDataSource;
////    }
//    @Bean
//    public DruidDataSource getDruidDataBase(){
//        DruidDataSource druidDataSource = new DruidDataSource();
//        druidDataSource.setDriverClassName(config.getDriver());
//        druidDataSource.setPassword(config.getPassword());
//        druidDataSource.setUrl(config.getUrl());
//        druidDataSource.setUsername(config.getUsername());
//        return druidDataSource;
//    }
//}
