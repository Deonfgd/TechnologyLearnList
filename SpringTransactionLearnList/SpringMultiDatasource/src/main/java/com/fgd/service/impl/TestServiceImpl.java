package com.fgd.service.impl;

import com.fgd.dao.ITestDao;
import com.fgd.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @document: TODO
 * @author: fgd
 * @date: 2022/3/3
 */
@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    private ITestDao testDao;

    @Override
    public String testDb(String datasourceId) {
        return testDao.testDb();
    }
}
