package com.njupt;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

/**
 * @program: cloud20_21
 * @description:
 * @author: Mr.Sun
 * @create: 2021-08-07 15:16
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class Dashboard9001 {
    public static void main(String[] args) {
        SpringApplication.run(Dashboard9001.class,args);
    }



}
