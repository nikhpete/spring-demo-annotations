package com.nick.springdemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nick.springdemo.service.FortuneService;

@Component
public class SwimCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fs;

	@Value("${email}")
	private String email;

	@Value("${team}")
	private String team;

	@Override
	public String getDailyWorkout() {
		System.out.println("\n"+fs.getFortune());
		System.out.println(email);
		System.out.println(team);
		return "ButterFly stroke 6 times";
	}

}
