package com.mwl.mshop.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author mawenlong
 * @date 2019/2/25
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MshopProviderDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MshopProviderDemoApplication.class, args);
    }

}
