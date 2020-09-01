package com.nick.springdemo.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Value("${data}")
	private String[] data;
	
	@Override
	public String getFortune() {
		return "Random Fortune: "+data[new Random().nextInt(data.length)];
	}

}
