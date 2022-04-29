package com.fgd.seata.service.impl;

import com.fgd.seata.dao.TestDao;
import com.fgd.seata.service.ISeataService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @document: TODO
 * @author: fgd
 * @date: 2022/2/27
 */
@Service
public class SeataServiceImpl implements ISeataService {

    @Autowired
    private TestDao testDao;

    @Override
    @GlobalTransactional
    public String testSeata() {
        testDao.selectForUpdate();

        System.out.println();
        return ";";
    }

}
