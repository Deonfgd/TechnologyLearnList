package com.fgd.controller;

import com.fgd.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @document: TODO
 * @author: fgd
 * @date: 2022/3/3
 */
@RestController
@RequestMapping("db")
public class TestController {

    @Autowired
    private ITestService testService;

    @RequestMapping("test")
    public String testDb(@RequestParam("id") String datasourceId) {
        return testService.testDb(datasourceId);
    }

}
