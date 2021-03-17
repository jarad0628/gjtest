package com.guus.gjtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.guus.gjtest.mapper")
public class GjtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GjtestApplication.class, args);
    }

}
