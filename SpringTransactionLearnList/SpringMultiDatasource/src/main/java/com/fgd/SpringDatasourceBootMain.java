package com.fgd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

/**
 * @document: TODO
 * @author: fgd
 * @date: 2022/3/3
 */
@MapperScan("com.fgd.dao")
@SpringBootApplication(exclude = DataSource.class)
public class SpringDatasourceBootMain {

    public static void main(String[] args) {
        SpringApplication.run(SpringDatasourceBootMain.class);
    }

}
