package com.fgd.controller;

import com.fgd.dto.UserDTO;
import com.fgd.service.IHelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @document: hello controller
 * @author: fgd
 * @date: 2022/4/16
 */
@RestController
@RequestMapping("dubbo/simple")
public class HelloController {

    @DubboReference
    IHelloService helloService;

    @RequestMapping("hello")
    public String sayHello(UserDTO userDTO) {
        return helloService.sayHello(userDTO);
    }

}
