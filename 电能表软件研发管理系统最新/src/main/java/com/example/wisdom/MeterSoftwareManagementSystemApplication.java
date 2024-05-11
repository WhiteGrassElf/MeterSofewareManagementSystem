package com.example.wisdom;

import com.github.jeffreyning.mybatisplus.conf.EnableMPP;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.example.wisdom.mapper")
@EnableMPP
//打成jar包需要继承SpringBootServletInitializer
public class MeterSoftwareManagementSystemApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MeterSoftwareManagementSystemApplication.class, args);
    }
    //打成jar包需要添加以下函数
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MeterSoftwareManagementSystemApplication.class);
    }

}
