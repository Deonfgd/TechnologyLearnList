package com.fgd.shardingjdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fgd.shardingjdbc.entity.ShardingJdbcOrders;
import org.springframework.stereotype.Repository;

/**
 * @document: TODO
 * @author: fgd
 * @date: 2021/12/16
 */
@Repository
public interface OrdersMapper extends BaseMapper<ShardingJdbcOrders> {
}
