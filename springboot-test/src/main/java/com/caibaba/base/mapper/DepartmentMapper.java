package com.caibaba.base.mapper;

import com.caibaba.base.entitys.Department;

import java.util.List;

/**
 * 部门相关服务
 */
public interface DepartmentMapper {
    int insert(Department department);

    int update(Department department);

    Department selectByPrimaryKey(Long id);

    List<Department> listAll();
}
