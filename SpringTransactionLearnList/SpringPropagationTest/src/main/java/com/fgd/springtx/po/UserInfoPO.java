package com.fgd.springtx.po;

import com.fgd.springtx.entiries.Address;
import com.fgd.springtx.entiries.User;
import lombok.Data;

/**
 * @document: TODO
 * @author: fgd
 * @date: 2022/2/18
 */
@Data
public class UserInfoPO {

    private User user;

    private Address address;

}
