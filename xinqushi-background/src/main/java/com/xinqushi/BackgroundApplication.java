package com.xinqushi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages="com.xinqushi.mapper")
@ComponentScan(basePackages="com.xinqushi.*")
public class BackgroundApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(BackgroundApplication.class, args);
    }
}
