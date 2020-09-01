package com.nick.springdemo.service;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Fortune retrieved from REST cal";
	}

}
