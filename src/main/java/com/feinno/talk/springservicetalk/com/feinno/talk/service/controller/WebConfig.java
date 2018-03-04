package com.feinno.talk.springservicetalk.com.feinno.talk.service.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author yushaobo
 * @create 2018-01-21 16:47
 * 用于springboot静态资源配置
 **/

@EnableWebMvc
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX+"/templates/");
//        registry.addResourceHandler("/templates/talker/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX+ "/templates/talker/");
//        registry.addResourceHandler("/admin/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX+"/admin/");
        super.addResourceHandlers(registry);
    }
}
