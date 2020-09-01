package com.nick.springdemo.model;

import org.springframework.stereotype.Component;

@Component("someCoach")
public class VolleyBallCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Kicking the ball";
	}

}
