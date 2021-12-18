package com.fgd.shardingjdbc.service.impl;

import com.fgd.shardingjdbc.entity.FgdFGDShardingJdbcGoods;
import com.fgd.shardingjdbc.mapper.GoodsMapper;
import com.fgd.shardingjdbc.service.IGoodsService;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @document: TODO
 * @author: fgd
 * @date: 2021/12/16
 */
@Service
public class GoodsServiceImpl implements IGoodsService<FgdFGDShardingJdbcGoods> {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public void add(FgdFGDShardingJdbcGoods shardingJdbcGoods) {
        goodsMapper.insert(shardingJdbcGoods);
    }

    /**
     *
     * @param collection tables
     * @param preciseShardingValue column condition
     * @return
     */
    @Override
    public String doSharding(Collection collection, PreciseShardingValue preciseShardingValue) {
        String logicTableName = preciseShardingValue.getLogicTableName();
        String columnName = preciseShardingValue.getColumnName();
        long goodsId = (long) preciseShardingValue.getValue();

        List<String> tableNameList = new ArrayList<>(collection);
        tableNameList.sort(String::compareTo);

        return tableNameList.get((int) (goodsId % 2));
    }

}
