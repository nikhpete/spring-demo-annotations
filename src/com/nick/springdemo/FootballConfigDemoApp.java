package com.nick.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nick.springdemo.config.FootBallCoachConfig;
import com.nick.springdemo.model.Coach;

public class FootballConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FootBallCoachConfig.class);
		
		
		Coach aCoach = context.getBean("footballCoach", Coach.class);
		
		System.out.println(aCoach.getDailyWorkout());
		
		context.close();
	}

}
