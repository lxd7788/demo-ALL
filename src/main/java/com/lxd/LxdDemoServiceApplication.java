package com.lxd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan("com.lxd.mapper")
public class LxdDemoServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(LxdDemoServiceApplication.class, args);
    }
}
