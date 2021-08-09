package com.njupt.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: cloud20_21
 * @description:
 * @author: Mr.Sun
 * @create: 2021-08-05 21:04
 **/
@Component
public class MyLB implements LoadBalance{

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement(){
        int current ;
        int next ;
        do{
            current = this.atomicInteger.get();
            next = current >=2147483647?0 : current+1;
        }while(!this.atomicInteger.compareAndSet(current,next));
        System.out.println("***next第几次访问："+next);
        return next ;
    }
    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);

    }
}
