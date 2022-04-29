package com.fgd.seata.controller;

import com.fgd.seata.service.ISeataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @document: TODO
 * @author: fgd
 * @date: 2022/2/27
 */
@RestController
@RequestMapping("seata")
public class SeataController {

    @Autowired
    private ISeataService seataService;

    @RequestMapping("test")
    public String testSeata() {
        return seataService.testSeata();
    }

}
