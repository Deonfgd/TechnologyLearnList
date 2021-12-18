package com.fgd.shardingjdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fgd.shardingjdbc.entity.FgdFGDShardingJdbcGoods;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

/**
 * @document: TODO
 * @author: fgd
 * @date: 2021/12/16
 */
// mybatis-plus: defalt use pojo as HisName
@Repository
public interface GoodsMapper extends BaseMapper<FgdFGDShardingJdbcGoods> {

    @Insert("INSERT INTO t_sharding_jdbc_goods values(#{goodsId}, #{goodsCode}, #{goodsAbs}, #{goodDesc}, #{createTime}, #{createUid}, #{updateTime}, #{updateUid})")
    int insertGoods(FgdFGDShardingJdbcGoods fgdFGDShardingJdbcGoods);
}
