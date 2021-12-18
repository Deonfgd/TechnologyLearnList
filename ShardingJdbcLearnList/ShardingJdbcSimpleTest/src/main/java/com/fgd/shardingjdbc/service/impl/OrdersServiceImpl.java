package com.fgd.shardingjdbc.service.impl;

import com.fgd.shardingjdbc.entity.ShardingJdbcOrders;
import com.fgd.shardingjdbc.mapper.OrdersMapper;
import com.fgd.shardingjdbc.service.IOrdersService;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @document: TODO
 * @author: fgd
 * @date: 2021/12/16
 */
@Service
public class OrdersServiceImpl implements IOrdersService<ShardingJdbcOrders> {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public void add(ShardingJdbcOrders shardingJdbcOrders) {
        ordersMapper.insert(shardingJdbcOrders);
    }

    @Override
    public Collection<String> doSharding(Collection<String> collection, RangeShardingValue<ShardingJdbcOrders> rangeShardingValue) {
        return null;
    }
}
