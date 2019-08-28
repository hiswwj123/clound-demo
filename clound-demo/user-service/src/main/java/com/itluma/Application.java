package com.itluma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author:wangjun
 * @Data:Createa in 2019/8/27 0027 21:12
 */
@SpringBootApplication
@MapperScan(basePackages = "com.itluma.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
