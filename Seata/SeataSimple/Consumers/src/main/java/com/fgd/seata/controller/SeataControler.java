package com.fgd.seata.controller;

import com.fgd.seata.service.ISeataService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

    @GlobalTransactional
    @RequestMapping("consumer")
    public String testSeata() {
        seataService.testSeata();

        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        restTemplate.exchange("http://localhost:10000/seata/simple/provider",
                HttpMethod.GET, null, String.class);
        return "";
    }

}
