package com.fgd.seata.conf;

import com.alibaba.druid.pool.DruidDataSource;
import io.seata.rm.datasource.DataSourceProxy;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @document: TODO
 * @author: fgd
 * @date: 2022/5/1
 */
@Configuration
public class SeataConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.ds0")
    public DruidDataSource ds0() {
        DruidDataSource dataSource = new DruidDataSource();

        return dataSource;
    }

    @Primary
    @Bean
    public DataSource dataSource(DruidDataSource ds0) {
        DataSourceProxy pds0 = new DataSourceProxy(ds0);
        return pds0;
    }

}
