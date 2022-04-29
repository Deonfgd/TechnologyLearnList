package com.fgd.springtx.service.impl;

import com.fgd.springtx.entiries.Address;
import com.fgd.springtx.entiries.User;
import com.fgd.springtx.mapper.AddressMapper;
import com.fgd.springtx.mapper.UserMapper;
import com.fgd.springtx.service.IAddressService;
import com.fgd.springtx.service.IUserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @document: TODO
 * @author: fgd
 * @date: 2022/2/17
 */
@Service
public class UserServiceImpl implements IUserService, BeanFactoryAware {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println();
    }

    @Autowired
    private IAddressService addressService;

    @Autowired
    private IUserService userService;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private AddressMapper addressMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addUser(User user, Address address) {
        doUserAdd(user);
        doAddressAdd(address);
    }

    @Override
    public void doUserAdd(User user) {
        userMapper.addUser(user);
    }

    @Override
    public void doAddressAdd(Address address) {
        addressMapper.addAddress(address);

//        int i = 1 / 0;
    }
}
