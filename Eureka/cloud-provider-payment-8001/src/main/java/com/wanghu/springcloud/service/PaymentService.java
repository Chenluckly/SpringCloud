package com.wanghu.springcloud.service;

import com.wanghu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author wanghu
 * @date 2022/2/5 20:22
 */
public interface PaymentService {
    public int create(Payment payment); //写
    public Payment getPaymentById(@Param("id") Long id);  //读取
}

