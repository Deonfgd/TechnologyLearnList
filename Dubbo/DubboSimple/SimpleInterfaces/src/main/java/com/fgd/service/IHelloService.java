package com.fgd.service;

import com.fgd.dto.UserDTO;

/**
 * @document: Service interface
 * @author: fgd
 * @date: 2022/4/16
 */
public interface IHelloService {

    /**
     * give consumer a greets
     *
     * @param userDTO consumer user info
     * @return
     */
    String sayHello(UserDTO userDTO);

}
