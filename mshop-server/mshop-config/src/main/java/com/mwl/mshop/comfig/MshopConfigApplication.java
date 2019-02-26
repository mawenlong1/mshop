package com.mwl.mshop.comfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author mawenlong
 * @date 2019/2/26
 */
@EnableConfigServer
@SpringBootApplication
@EnableDiscoveryClient
public class MshopConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(MshopConfigApplication.class, args);
    }

}
