package com.caibaba.base.form;

import com.caibaba.base.entitys.Department;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Data
public class RegisterForm {

    private Long id;
    @NotEmpty(message = "用户名不能为空")
    private String username;
    @Min(value = 12,message = "不低于12岁")
    private Integer age;
    private String password;

    private String hobby;

    private Department deptId;
}
