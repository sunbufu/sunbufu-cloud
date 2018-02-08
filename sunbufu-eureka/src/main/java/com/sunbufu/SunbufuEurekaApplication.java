package com.sunbufu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SunbufuEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SunbufuEurekaApplication.class, args);
	}
}
