package com.fgd.common;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @document: TODO
 * @author: fgd
 * @date: 2022/4/23
 */
@DubboService
public class UserInfoServiceImpl implements IUserInfoService {

    @Override
    public String getUserName(String userId) {
        return null;
    }

}
