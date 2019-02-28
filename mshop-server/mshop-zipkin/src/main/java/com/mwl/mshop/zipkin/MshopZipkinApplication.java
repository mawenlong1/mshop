package com.mwl.mshop.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class MshopZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(MshopZipkinApplication.class, args);
	}

}
