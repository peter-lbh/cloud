package com.caibaba.base.entitys;

import lombok.Data;

@Data
public class LoginInfo {
    private Long id;

    private String username;

    private Integer age;

    private String password;

    private String hobby;

    private Department deptId;
}
