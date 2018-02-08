package com.sunbufu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${nickName}")
	private String nickName;

	@RequestMapping("/hello")
	public String hello() {
		return "hello " + nickName;
	}

}
