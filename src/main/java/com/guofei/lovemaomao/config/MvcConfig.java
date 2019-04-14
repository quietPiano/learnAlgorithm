package com.gf.crm.config;

import com.gf.crm.interceptor.CorsInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 解决跨域请求
 *
 * @author 阿飞
 * @email guof@weilaicheng.com
 * @date 2019-03-17 09:44
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CorsInterceptor()).addPathPatterns("/**");
    }
}
