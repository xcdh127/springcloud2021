package com.njupt.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: cloud20_21
 * @description:
 * @author: Mr.Sun
 * @create: 2021-08-07 17:47
 **/
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder router = routeLocatorBuilder.routes();
//https://mvnrepository.com/artifact/net.n2oapp.framework/n2o-api/usages
        router.route("path_route_njupt",r -> r.path("/artifact/net.n2oapp.framework/n2o-api/usages").uri("https://mvnrepository.com/artifact/net.n2oapp.framework/n2o-api/usages")).build();

        return router.build();

    }
}
