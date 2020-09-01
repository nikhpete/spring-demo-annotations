package com.nick.springdemo.service;

import org.springframework.stereotype.Component;

@Component
public class DataBaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Fortune retrieved from DB";
	}

}
