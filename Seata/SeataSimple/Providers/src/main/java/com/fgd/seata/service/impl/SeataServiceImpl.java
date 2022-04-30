package com.fgd.seata.service.impl;

import com.fgd.seata.dao.ISeataDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fgd.seata.service.ISeataService;

/**
 * @document: class instance
 * @author: fgd
 * @date: 2022/4/29
 */
@Service
public class SeataServiceImpl  implements ISeataService {

    @Autowired
    private ISeataDao seataDao;

    @Override
    public void testSeata() {
        int i = 1 / 0;
        seataDao.test(null, "provider");
    }

}
