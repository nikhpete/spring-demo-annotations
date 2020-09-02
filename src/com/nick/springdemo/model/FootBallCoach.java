package com.nick.springdemo.model;

import com.nick.springdemo.service.FortuneService;

public class FootBallCoach implements Coach {

	private FortuneService fs;
	
	public FootBallCoach(FortuneService fs) {
		this.fs = fs;
	}
	
	@Override
	public String getDailyWorkout() {
		System.out.println(fs.getFortune());
		return "Run full of the football court";
	}

}
