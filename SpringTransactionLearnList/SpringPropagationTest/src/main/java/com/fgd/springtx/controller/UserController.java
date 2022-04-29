package com.fgd.springtx.controller;

import com.fgd.springtx.entiries.Address;
import com.fgd.springtx.entiries.User;
import com.fgd.springtx.po.UserInfoPO;
import com.fgd.springtx.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @document: TODO
 * @author: fgd
 * @date: 2022/2/17
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("addUser")
    public String addUser(@RequestBody UserInfoPO userInfoPO) {
        userService.addUser(userInfoPO.getUser(), userInfoPO.getAddress());
        return "";
    }

}
