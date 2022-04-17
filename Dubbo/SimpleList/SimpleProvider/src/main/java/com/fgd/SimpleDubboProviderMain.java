package com.fgd;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @document: boot main
 * @author: fgd
 * @date: 2022/4/16
 */
@DubboComponentScan
@SpringBootApplication
public class SimpleDubboProviderMain {

    public static void main(String[] args) {
        SpringApplication.run(SimpleDubboProviderMain.class);
    }

}
