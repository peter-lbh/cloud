package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;

import java.util.List;

public interface IDeptService {
    int insert(Dept record);

    List<Dept> selectAll();

    Dept selectById(Long id);
}
