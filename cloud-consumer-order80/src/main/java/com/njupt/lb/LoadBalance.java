package com.njupt.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @program: cloud20_21
 * @description:
 * @author: Mr.Sun
 * @create: 2021-08-05 21:02
 **/
public interface LoadBalance {

    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
