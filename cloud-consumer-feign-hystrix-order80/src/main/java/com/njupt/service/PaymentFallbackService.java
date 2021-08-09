package com.njupt.service;

import org.springframework.stereotype.Component;

/**
 * @program: cloud20_21
 * @description:
 * @author: Mr.Sun
 * @create: 2021-08-07 13:45
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService_paymentInfo_OK,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_timeout(Integer id) {
        return "PaymentFallbackService_paymentInfo_timeout,o(╥﹏╥)o";
    }
}
