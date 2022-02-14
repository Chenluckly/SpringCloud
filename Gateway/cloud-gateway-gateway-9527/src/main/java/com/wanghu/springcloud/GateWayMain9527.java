package com.wanghu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author wanghu
 * @date 2022/2/11 20:45
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
    public static void main(String[] args)
    {
        SpringApplication.run(GateWayMain9527.class, args);
    }
}


