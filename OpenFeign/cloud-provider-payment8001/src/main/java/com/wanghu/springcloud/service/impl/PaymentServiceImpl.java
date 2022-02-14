package com.wanghu.springcloud.service.impl;

import com.wanghu.springcloud.Dao.PaymentDao;
import com.wanghu.springcloud.entities.Payment;
import com.wanghu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wanghu
 * @date 2022/2/5 20:23
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);

    }

}

