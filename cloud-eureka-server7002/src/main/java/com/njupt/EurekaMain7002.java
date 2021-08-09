package com.njupt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: cloud20_21
 * @description: 666
 * @author: Mr.Sun
 * @create: 2021-08-04 14:38
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {
    public static void main(String[] args) {
       SpringApplication.run(EurekaMain7002.class,args);
    }

}
