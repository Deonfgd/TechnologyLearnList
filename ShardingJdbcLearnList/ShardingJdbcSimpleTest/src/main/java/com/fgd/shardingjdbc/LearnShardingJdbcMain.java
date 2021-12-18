package com.fgd.shardingjdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @document: TODO
 * @author: fgd
 * @date: 2021/12/15
 */
@SpringBootApplication
@MapperScan(basePackages = "com.fgd.shardingjdbc.mapper")
public class LearnShardingJdbcMain {

    public static void main(String[] args) {
        SpringApplication.run(LearnShardingJdbcMain.class);
    }

}
