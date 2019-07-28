package com.caibaba.base.service.impl;

import com.caibaba.base.entitys.LoginInfo;
import com.caibaba.base.mapper.LoginInfoMapper;
import com.caibaba.base.service.ILoginInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginInfoServiceImpl implements ILoginInfoService {
    @Autowired
    private LoginInfoMapper loginInfoMapper;
    @Override
    public int register(LoginInfo loginInfo) {
        int result = this.loginInfoMapper.insert(loginInfo);
        return result;
    }

    @Override
    public LoginInfo selectOne(Long id) {
        LoginInfo result = this.loginInfoMapper.selectByPrimaryKey(id);
        if(result==null){
            throw new RuntimeException("没有这个用户");
        }
        return result;
    }
}
