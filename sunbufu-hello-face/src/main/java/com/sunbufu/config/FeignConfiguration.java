package com.sunbufu.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.auth.BasicAuthRequestInterceptor;

@Configuration
public class FeignConfiguration {
	
	@Value("${security.user.name}")
	private String userName;
	
	@Value("${security.user.password}")
	private String passWord;
	
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor(){
        return new BasicAuthRequestInterceptor(userName, passWord);
    }
}
