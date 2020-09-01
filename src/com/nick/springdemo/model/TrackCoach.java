package com.nick.springdemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nick.springdemo.service.FortuneService;

@Component
public class TrackCoach implements Coach {

	//field injection
	@Autowired
	private FortuneService fs;

	@Override
	public String getDailyWorkout() {
		System.out.println(fs.getFortune());
		return "Run along 5k";
	}

}
