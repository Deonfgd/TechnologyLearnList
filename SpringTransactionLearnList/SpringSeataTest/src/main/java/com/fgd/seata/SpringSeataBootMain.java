package com.fgd.seata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @document: TODO
 * @author: fgd
 * @date: 2022/2/27
 */
@MapperScan("com.fgd.seata.dao")
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringSeataBootMain {

    public static void main(String[] args) {

        SpringApplication.run(SpringSeataBootMain.class);

    }

}
