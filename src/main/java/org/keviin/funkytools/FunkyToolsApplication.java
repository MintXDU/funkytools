package org.keviin.funkytools;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.keviin.funkytools.mapper")
public class FunkyToolsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FunkyToolsApplication.class, args);
    }

}
