package com.caibaba.base.service;

import com.caibaba.base.entitys.LoginInfo;

/**
 * 用户相关业务
 */
public interface ILoginInfoService {
    /**
     * 用户注册
     * @param loginInfo
     * @return
     */
    int register(LoginInfo loginInfo);

    /**
     * 查询一个用户
     * @param id
     * @return
     */
    LoginInfo selectOne(Long id);
}
