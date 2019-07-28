package com.caibaba.base.interceptor;
/**
 * 继承这个类实现的拦截器也可以
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Slf4j
public class MyInterceptor1 extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("继承拦截适配器的拦截器执行了");
        return super.preHandle(request, response, handler);
    }


}
