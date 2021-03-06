package com.example.helpingout.controllers;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    // EVERY NEW HTML and view must be added here.
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/user-home").setViewName("user-home");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/registration").setViewName("registration");
        registry.addViewController("/users/index").setViewName("users/index");
        registry.addViewController("/admin").setViewName("admin/index");
//        registry.addViewController("/admin/tags/index").setViewName("admin/tags/index");
//        registry.addViewController("/admin/tags/create").setViewName("admin/tags/create");
        registry.addViewController("/tags/index").setViewName("tags/index");
        registry.addViewController("/volunteers/index").setViewName("volunteers/index");
        registry.addViewController("/companies/index").setViewName("companies/index");
//        registry.addViewController("/users/detail?userId=*").setViewName("users/detail");
        registry.addViewController("/list-companies").setViewName("list-companies");
        registry.addViewController("/list-companies/company-view").setViewName("company-view");
        registry.addViewController("/list-volunteers").setViewName("list-volunteers");
        registry.addViewController("/list-volunteers/view").setViewName("view");
        registry.addViewController("/company-home").setViewName("company-home");
        registry.addViewController("/volunteer-home").setViewName("volunteer-home");
    }

}