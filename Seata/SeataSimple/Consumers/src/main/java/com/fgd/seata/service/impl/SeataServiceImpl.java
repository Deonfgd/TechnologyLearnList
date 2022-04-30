package com.fgd.seata.service.impl;

import com.fgd.seata.dao.ISeataDao;
import com.fgd.seata.service.ISeataService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        seataDao.save(null, "fgd");
    }

}
