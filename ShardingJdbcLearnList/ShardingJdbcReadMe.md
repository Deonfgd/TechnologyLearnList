2021-12-18
1. 搭建ShardingJdbc应用
1.1 工程搭建
依赖：
```yml
<dependencies>
<!--        Springboo依赖-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid-spring-boot-starter</artifactId>
            <version>1.1.30</version>
        </dependency>

        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
        </dependency>

<!--        sharding-jdbc依赖-->
        <dependency>
            <groupId>org.apache.shardingsphere</groupId>
            <artifactId>sharding-jdbc-spring-boot-starter</artifactId>
            <version>4.0.0-RC1</version>
        </dependency>

        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-boot-starter</artifactId>
            <version>3.0.5</version>
        </dependency>

        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
        </dependency>
    </dependencies>
```

1.2 表结构配置
数据库：learning
表：商品表和订单表
```sql
## goods
CREATE TABLE t_sharding_jdbc_goods_1 (
    goods_id bigint(20) not null primary key auto_increment comment '商品id',
    goods_code varchar(50) not null comment '商品编码',
    goods_abs varchar(100) not null default '' comment '商品概要',
    good_desc varchar(1000) comment '商品描述',
    create_time date not null comment '创建人',
    create_uid varchar(20) not null  comment '创建时间',
    update_time date not null  comment '修改人',
    update_uid varchar(20) not null  comment '修改时间'
);

## orders
CREATE TABLE t_sharding_jdbc_orders_1 (
   orders_id bigint(20) not null primary key auto_increment comment '订单id',
   orders_nbr varchar(50) not null comment '订单流水号',
   goods_id varchar(100) not null default '' comment '商品id',
   order_desc varchar(1000) comment '订单描述',
   create_time date not null comment '创建人',
   create_uid varchar(20) not null  comment '创建时间',
   update_time date not null  comment '修改人',
   update_uid varchar(20) not null  comment '修改时间'
);
```

1.3 代码编写
```java
// Mapper
// Service
// Controller
// Main
// POJO
```

1.4 配置表及相关策略
```yml
## notify: 请注意配置格式
## view: https://shardingsphere.apache.org/document/legacy/4.x/document/cn/manual/sharding-jdbc/configuration/config-spring-boot/
spring:
  #  datasource:
  #    driver-class-name: com.mysql.cj.jdbc.Driver
  #    url: jdbc:mysql://localhost:3306/learning
  #    username: root
  #    password: fangroot

  ## auto configuration: SpringBootConfiguration
  shardingsphere:
    ## 数据源
    datasource:
      #[ds1,...]
      names: ds0

      ## 数据源信息
      ds0:
        type: com.alibaba.druid.pool.DruidDataSource
        driverClassName: com.mysql.cj.jdbc.Driver
        url: jdbc:mysql://localhost:3306/learning?ServerTimezone=GTM%2B8
        username: root
        password: fangroot
      # 其他数据源配置
      # ds1: ...

    # 分库分表策略
    sharding:
      ## 具体表
      tables:
        # 逻辑表名（SQL中写的表名是逻辑表名）
        t_sharding_jdbc_goods:
          ## 由数据源和表组合而成 ds$->{0..0}
          actualDataNodes: ds${0..0}.t_sharding_jdbc_goods_${0..1}

          #          database-stratey:

          ## 分表策略
          tableStrategy:
            ## view: org.apache.shardingsphere.core.yaml.config.sharding.YamlShardingStrategyConfiguration
            ## 各个策略的取值参考该类下子（strategy）下的配置类
            ## org.apache.shardingsphere.api.sharding.standard
            standard:
              shardingColumn: goodsId
              preciseAlgorithmClassName: com.fgd.service.impl.GoodsServiceImpl
              rangeAlgorithmClassName: com.fgd.service.impl.OrdersServiceImpl

      props:
        sql:
          show: true

  ## 原因未知，若不配置可能出现bean名称重复错误
  main:
    allow-bean-definition-overriding: true

server:
  port: 8090
```