package com.fgd.shardingjdbc.service;

import com.fgd.shardingjdbc.entity.ShardingJdbcOrders;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;

/**
 * @document: TODO
 * @author: fgd
 * @date: 2021/12/16
 */
public interface IOrdersService<T extends Comparable<?>> extends RangeShardingAlgorithm<T> {
    void add(ShardingJdbcOrders shardingJdbcOrders);
}
