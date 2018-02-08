package com.sunbufu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbufu.server.HelloServer;

@RestController
public class HelloController implements HelloServer {

	@RequestMapping("/hello")
	@Override
	public String hello(String name, String serverName) {
		return "hello," + name + " from server:" + serverName;
	}

}
