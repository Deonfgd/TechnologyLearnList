package com.fgd.seata.controller;

import com.fgd.seata.service.ISeataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * @document: seata controller
 * @author: fgd
 * @date: 2022/4/29
 */
@RestController
@RequestMapping("seata/simple")
public class SeataControler {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private ISeataService seataService;

    @RequestMapping("consumer")
    public String testSeata() {
        seataService.testSeata();

//        try {
//            restTemplate.postForEntity(new URI("http://localhost:10000/seata/simple/provider"),
//                    null, null);
//        } catch (URISyntaxException e) {
//            e.printStackTrace();
//        }
        return "";
    }

}
