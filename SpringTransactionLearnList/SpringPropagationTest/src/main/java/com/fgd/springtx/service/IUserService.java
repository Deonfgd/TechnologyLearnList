package com.fgd.springtx.service;

import com.fgd.springtx.entiries.Address;
import com.fgd.springtx.entiries.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * @document: TODO
 * @author: fgd
 * @date: 2022/2/17
 */
public interface IUserService {

    void addUser(User user, Address address);

    void doUserAdd(User user);

    void doAddressAdd(Address address);
}
