package com.nick.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nick.springdemo.model.Coach;
import com.nick.springdemo.model.FootBallCoach;
import com.nick.springdemo.service.FortuneService;
import com.nick.springdemo.service.SadFortuneService;

@Configuration
public class FootBallCoachConfig {
	
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	@Bean
	public Coach footballCoach() {
		return new FootBallCoach(sadFortuneService());
	}
}
