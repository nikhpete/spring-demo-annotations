package com.nick.springdemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nick.springdemo.service.FortuneService;

@Component()
public class TennisCoach implements Coach {

	private FortuneService fs;

	@Autowired
	public TennisCoach(FortuneService fs) {
		this.fs = fs;
	}



	@Override
	public String getDailyWorkout() {
		System.out.println(fs.getFortune());
		return "Practise your backhand vollley";
	}

}
