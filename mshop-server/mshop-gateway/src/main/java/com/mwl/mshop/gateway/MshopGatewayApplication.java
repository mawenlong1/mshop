package com.mwl.mshop.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author mawenlong
 * @date 2019/2/26
 */
@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class MshopGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MshopGatewayApplication.class, args);
    }

}
