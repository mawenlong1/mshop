package com.mwl.mshop.hystric.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class MshopHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MshopHystrixDashboardApplication.class, args);
	}

}
