package com.wanghu.springcloud.alibaba.controller;

import com.wanghu.springcloud.alibaba.Service.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghu
 * @date 2022/2/22 23:49
 */
@RestController
@Slf4j
public class TestController {
    /**
     *链路demo
     */

    @Autowired
    private ServiceImpl serviceImpl;

    @GetMapping("/message1")
    private String message1(){
        serviceImpl.message();
        return "wanghu  message1";
    }

    @GetMapping("/message2")
    private String message2(){
        serviceImpl.message();
        return "wanghu  message2";
    }
}

