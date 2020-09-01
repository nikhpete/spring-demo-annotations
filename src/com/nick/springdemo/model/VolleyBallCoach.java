package com.nick.springdemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nick.springdemo.service.FortuneService;

import lombok.NoArgsConstructor;

@Component("someCoach")
@NoArgsConstructor
public class VolleyBallCoach implements Coach {

	private FortuneService fs;

	// setter injection
	@Autowired
	public void setFs(FortuneService fs) {
		this.fs = fs;
	}

	@Override
	public String getDailyWorkout() {
		System.out.println(fs.getFortune());
		return "Kicking the ball";
	}

}
