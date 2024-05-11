package com.example.wisdom.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("*")
                .allowedHeaders("*");
    }
}

/*
CorsConfig 类是一个配置类，用于配置跨域资源共享（Cross-Origin Resource Sharing，CORS）规则。
CORS 是一种机制，允许 Web 应用程序从不同的域访问其资源。在前后端分离的项目中，通常会涉及到跨域请求，因此需要进行 CORS 配置以确保安全地进行跨域通信。
在这个 CorsConfig 类中，通过实现 WebMvcConfigurer 接口并重写 addCorsMappings 方法，您可以定义允许跨域请求的规则。
具体来说，这段代码中的配置表示允许所有来源（allowedOrigins("*")）、所有 HTTP 方法（allowedMethods("*")）和所有请求头（allowedHeaders("*")）的跨域请求。
通过将这样的 CORS 配置类添加到 Spring Boot 项目中，您可以确保在处理跨域请求时遵循特定的规则，从而提高项目的安全性和可靠性。
这种配置类的使用使得跨域请求变得更加灵活和可控，有助于解决前后端分离项目中的跨域访问问题。
* */

