package com.fgd.shardingjdbc.controller;

import com.fgd.shardingjdbc.entity.ShardingJdbcOrders;
import com.fgd.shardingjdbc.service.IOrdersService;
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
@RequestMapping("orders")
public class OrdersController {

    @Autowired
    private IOrdersService ordersService;

    @PostMapping("add")
    public String add(@RequestBody ShardingJdbcOrders shardingJdbcOrders) {
        ordersService.add(shardingJdbcOrders);
        return "200";
    }

}
