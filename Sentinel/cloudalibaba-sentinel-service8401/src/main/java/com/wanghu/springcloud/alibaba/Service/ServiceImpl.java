package com.wanghu.springcloud.alibaba.Service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @author wanghu
 * @date 2022/2/22 23:50
 */
@Service
public class ServiceImpl {

    //必须加上 @SentinelResource 注解，此处该注解类似 @HystrixCommand
    @SentinelResource("message")
    public  String message(){
        return "message";
    }
}

