package com.fgd.shardingjdbc.controller;

import com.fgd.shardingjdbc.entity.FgdFGDShardingJdbcGoods;
import com.fgd.shardingjdbc.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @document: TODO
 * @author: fgd
 * @date: 2021/12/16
 */
@RestController
@RequestMapping("goods")
public class GoodsController {

    @Autowired
    private IGoodsService goodsService;

    @PostMapping("add")
    public String add(@RequestBody FgdFGDShardingJdbcGoods shardingJdbcGoods) {
        goodsService.add(shardingJdbcGoods);
        return "200";
    }

}
