package com.sunbufu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SunbufuHelloImplApplication {

	public static void main(String[] args) {
		SpringApplication.run(SunbufuHelloImplApplication.class, args);
	}
}
