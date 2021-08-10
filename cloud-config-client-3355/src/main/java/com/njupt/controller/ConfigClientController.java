package com.njupt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cloud20_21
 * @description:
 * @author: Mr.Sun
 * @create: 2021-08-10 07:56
 **/
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;
    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return configInfo ;
    }
}
