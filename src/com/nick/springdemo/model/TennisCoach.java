package com.nick.springdemo.model;

import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practise your backhand vollley";
	}

}
