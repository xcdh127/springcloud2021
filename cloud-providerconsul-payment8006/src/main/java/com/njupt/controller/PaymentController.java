package com.njupt.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @program: cloud20_21
 * @description:
 * @author: Mr.Sun
 * @create: 2021-08-04 21:31
 **/
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;
    @RequestMapping(value = "/payment/consul")
    public String paymentConsul(){
        return "springCloud with consul:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }




}
