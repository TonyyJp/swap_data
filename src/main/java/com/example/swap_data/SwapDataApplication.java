package com.example.swap_data;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.example.swap_data.dao")
public class SwapDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwapDataApplication.class, args);
    }

}
