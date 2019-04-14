package com.gf.crm.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器(实现跨域)
 *
 * @author 阿飞
 * @email guof@weilaicheng.com
 * @date 2019-03-17 09:56
 */
public class CorsInterceptor implements HandlerInterceptor {
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "*");
        response.setHeader("Access-Control-Allow-Headers", "Origin,Content-Type,Accept,token,X-Requested-With,Authorization");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        return true;
    }
}
