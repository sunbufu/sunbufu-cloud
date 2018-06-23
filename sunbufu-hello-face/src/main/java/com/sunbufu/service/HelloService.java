package com.sunbufu.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sunbufu.config.FeignConfiguration;
import com.sunbufu.server.HelloServer;

@FeignClient(value = "sunbufu-hello-impl", configuration = FeignConfiguration.class)
public interface HelloService extends HelloServer {

	@RequestMapping("/hello")
	@Override
	String hello(@RequestParam("name") String name);

}
