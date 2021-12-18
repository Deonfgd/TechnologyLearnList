package com.fgd.shardingjdbc.service;

import com.fgd.shardingjdbc.entity.FgdFGDShardingJdbcGoods;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;

/**
 * @document: TODO
 * @author: fgd
 * @date: 2021/12/16
 */
public interface IGoodsService<T> extends PreciseShardingAlgorithm<FgdFGDShardingJdbcGoods> {
    void add(T t);
}
