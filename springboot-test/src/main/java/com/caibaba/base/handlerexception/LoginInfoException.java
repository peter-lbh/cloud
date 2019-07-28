package com.caibaba.base.handlerexception;

import com.caibaba.base.vo.JsonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class LoginInfoException {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public JsonResult result(Exception e){
        return new JsonResult(false,e.getMessage());
    }
}
