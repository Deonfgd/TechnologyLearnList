package com.fgd.seata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @document: seata main
 * @author: fgd
 * @date: 2022/4/29
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("com.fgd.seata.dao")
public class SeataConsumerBootMain {

    public static void main(String[] args) {
        SpringApplication.run(SeataConsumerBootMain.class);
    }

}
