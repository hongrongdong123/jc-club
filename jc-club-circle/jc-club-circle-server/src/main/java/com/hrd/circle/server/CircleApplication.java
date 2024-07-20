package com.hrd.circle.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * description:圈子微服务启动类
 */
@SpringBootApplication
@ComponentScan("com.hrd")
@MapperScan("com.hrd.**.mapper")
@EnableFeignClients(basePackages = "com.hrd")
public class CircleApplication {
    public static void main(String[] args) {
        SpringApplication.run(CircleApplication.class);
    }
}
