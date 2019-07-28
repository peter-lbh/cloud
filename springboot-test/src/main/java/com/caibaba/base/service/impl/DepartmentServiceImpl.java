package com.caibaba.base.service.impl;
/**
 * 部门相关服务
 */

import com.caibaba.base.entitys.Department;
import com.caibaba.base.mapper.DepartmentMapper;
import com.caibaba.base.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements IDepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public List<Department> selectAll() {
        return this.departmentMapper.listAll();
    }
}
