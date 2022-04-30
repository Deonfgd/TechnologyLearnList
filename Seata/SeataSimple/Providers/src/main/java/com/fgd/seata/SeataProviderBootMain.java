package com.fgd.seata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @document: seata main
 * @author: fgd
 * @date: 2022/4/29
 */
@SpringBootApplication
@MapperScan("com.fgd.seata.dao")
public class SeataProviderBootMain {

    public static void main(String[] args) {
        SpringApplication.run(SeataProviderBootMain.class);
    }

}
