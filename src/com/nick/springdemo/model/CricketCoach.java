package com.nick.springdemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nick.springdemo.service.FortuneService;

@Component
public class CricketCoach implements Coach {

	FortuneService fs;

	// method injection
	@Autowired
	public void doMyStuff(FortuneService fs) {
		this.fs = fs;
	}

	@Override
	public String getDailyWorkout() {
		System.out.println(fs.getFortune());
		return "try out helicopter shots";
	}

}
