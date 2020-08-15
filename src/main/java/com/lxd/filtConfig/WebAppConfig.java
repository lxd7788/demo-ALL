package com.lxd.filtConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebAppConfig implements WebMvcConfigurer{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginFilter());


//        addPathPatterns//这个是添加拦截路径，excludePathPatterns这个是排除拦截的路径多个路径中间用逗号隔开
//        registry.addInterceptor(new InterceptorConfig()).addPathPatterns("/**").excludePathPatterns("/loginPage","/login");
    }
}
