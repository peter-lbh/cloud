package com.caibaba.base.controller;

import com.caibaba.base.dto.LoginInfoDto;
import com.caibaba.base.entitys.Department;
import com.caibaba.base.entitys.LoginInfo;
import com.caibaba.base.form.RegisterForm;
import com.caibaba.base.service.IDepartmentService;
import com.caibaba.base.service.ILoginInfoService;
import com.caibaba.base.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/caibaba")
public class LoginInfoController {
    @Autowired
    private ILoginInfoService loginInfoService;

    @Autowired
    private IDepartmentService departmentService;

    @RequestMapping("/index")
    public ModelAndView index(Map map){
        List<Department> departmentList =  this.departmentService.selectAll();
        map.put("dept",departmentList);
        return new ModelAndView("index",map);
    }

    @GetMapping("/register")
    @ResponseBody
    public JsonResult register(@Valid RegisterForm register, BindingResult bindingResult){
        JsonResult jsonResult = new JsonResult();
        if (bindingResult.hasErrors()){
            jsonResult.setSuccess(false);
            jsonResult.setMessage(bindingResult.getFieldError().getDefaultMessage());
            return jsonResult;
        }
        int result =  this.loginInfoService.register(LoginInfoDto.registerForm2LoginInfo(register));

        if(result<=0){
            jsonResult.setSuccess(false);
            jsonResult.setMessage("注册失败");
            return jsonResult;
        }
        jsonResult.setMessage("注册成功");
        return jsonResult;

    }
    @GetMapping("/{id}")
    @ResponseBody
    public LoginInfo selectOne(@PathVariable("id") Long id){
        return this.loginInfoService.selectOne(id);
    }

}
