package com.hrd.practice.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * description:练题微服务启动类
 */
@SpringBootApplication
@ComponentScan("com.hrd")
@MapperScan("com.hrd.**.mapper")
@EnableFeignClients(basePackages = "com.hrd")
public class PracticeApplication {
    public static void main(String[] args) {
        SpringApplication.run(PracticeApplication.class);
    }
}
