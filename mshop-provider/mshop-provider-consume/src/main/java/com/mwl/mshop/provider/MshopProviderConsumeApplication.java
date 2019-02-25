package com.mwl.mshop.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author mawenlong
 * @date 2019/2/25
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MshopProviderConsumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MshopProviderConsumeApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}