package com.fgd.seata.controller;

import com.fgd.seata.service.ISeataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @document: seata controller
 * @author: fgd
 * @date: 2022/4/29
 */
@RestController
@RequestMapping("seata/simple")
public class SeataControler {

    @Autowired
    private ISeataService seataService;

    @RequestMapping("consumer")
    public String testSeata() {
        seataService.testSeata();
        return "";
    }

}
