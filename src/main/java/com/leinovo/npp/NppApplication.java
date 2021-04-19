package com.leinovo.npp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan({"com.leinovo.npp.mapper"})
@SpringBootApplication
public class NppApplication {

    public static void main(String[] args) {
        SpringApplication.run(NppApplication.class, args);
    }

}
