package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.DeptMapper;
import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements IDeptService {

    @Autowired
    private DeptMapper mapper;
    @Override
    public int insert(Dept record) {
        return this.mapper.insert(record);
    }

    @Override
    public List<Dept> selectAll() {

        return this.mapper.selectAll();
    }

    @Override
    public Dept selectById(Long id) {
        return this.mapper.selectById(id);
    }
}
