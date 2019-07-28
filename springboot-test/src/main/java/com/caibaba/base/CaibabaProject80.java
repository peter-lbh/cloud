package com.caibaba.base;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com/caibaba/base/mapper"})
public class CaibabaProject80 {
    public static void main(String[] args) {
        SpringApplication.run(CaibabaProject80.class,args);
    }
}
