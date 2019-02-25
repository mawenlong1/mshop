package com.mwl.mshop.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author mawenlong
 * @date 2019/2/25
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MshopProviderConsumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MshopProviderConsumeApplication.class, args);
    }

}
