package com.caibaba.base.dto;

import com.caibaba.base.entitys.LoginInfo;
import com.caibaba.base.form.RegisterForm;
import org.springframework.beans.BeanUtils;

public class LoginInfoDto {
    public static LoginInfo registerForm2LoginInfo(RegisterForm registerForm){
        LoginInfo loginInfo = new LoginInfo();
        BeanUtils.copyProperties(registerForm,loginInfo);
        return loginInfo;
    }
}
