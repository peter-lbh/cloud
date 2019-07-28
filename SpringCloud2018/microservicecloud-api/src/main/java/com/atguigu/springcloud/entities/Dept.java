package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)//开启链式set值的写法
public class Dept implements Serializable {

    private static final long serialVersionUID = 4396466188177744809L;
    private Long id;
    private String dname;
    private String dbSource;



}
