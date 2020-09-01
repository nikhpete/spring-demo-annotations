package com.nick.springdemo.service;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = { 
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	@Override
	public String getFortune() {
		return "Random Fortune: "+data[new Random().nextInt(data.length)];
	}

}
