package com.caibaba.base.mapper;

import com.caibaba.base.entitys.LoginInfo;

import java.util.List;

public interface LoginInfoMapper {
    /**
     * 插入
     * @param loginInfo
     * @return
     */
    int insert(LoginInfo loginInfo);

    int update(LoginInfo loginInfo);

    LoginInfo selectByPrimaryKey(Long id);

    List<LoginInfo> selectAll();


}
