package com.j16.springbootvue_915;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.j16.springbootvue_915.dao")
public class SpringBootVue915Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootVue915Application.class, args);
    }

}
