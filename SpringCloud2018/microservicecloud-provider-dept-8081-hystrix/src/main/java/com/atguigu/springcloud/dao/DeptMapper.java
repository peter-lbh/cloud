package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Dept;

import java.util.List;

//@mapper 现在能加上扫描组件了
public interface DeptMapper {
    int insert(Dept record);

    List<Dept> selectAll();

    Dept selectById(Long id);

}