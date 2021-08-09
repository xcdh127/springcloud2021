package com.njupt.service;

import com.njupt.dao.PaymentDao;
import com.njupt.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: cloud20_21
 * @description: 666
 * @author: Mr.Sun
 * @create: 2021-07-31 21:17
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
