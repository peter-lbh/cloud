package com.caibaba.base.config;
/**
 * 除了拦截器还有需要自定义注册的mvc组件可以通过实现该类并覆盖某个方法来注册
 */

import com.caibaba.base.interceptor.MyInterceptor;
import com.caibaba.base.interceptor.MyInterceptor1;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration =  registry.addInterceptor(new MyInterceptor());
        //添加拦截路径
//        registration.addPathPatterns("/caibaba/*");
        registration.addPathPatterns("/**");//路径有好多写法
        registry.addInterceptor(new MyInterceptor1()).addPathPatterns("/**");
    }
}
