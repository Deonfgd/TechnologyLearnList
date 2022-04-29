package com.fgd.service;

import com.fgd.dto.UserDTO;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @document: hello service
 * @author: fgd
 * @date: 2022/4/16
 */
@DubboService
public class HelloServiceImpl implements IHelloService {

    @Override
    public String sayHello(UserDTO userDTO) {
        return "Hello: " + userDTO;
    }

}
