package com.fgd.seata.service.impl;

import com.fgd.seata.dao.ISeataDao;
import com.fgd.seata.service.ISeataService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

/**
 * @document: class instance
 * @author: fgd
 * @date: 2022/4/29
 */
@Service
public class SeataServiceImpl  implements ISeataService {

    @Autowired
    private ISeataDao seataDao;

    @Transactional
    @GlobalTransactional
    @Override
    public void testSeata() {
        seataDao.save(null, "fgd");

        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        restTemplate.exchange("http://localhost:10000/seata/simple/provider",
                HttpMethod.GET, null, String.class);
    }

}
