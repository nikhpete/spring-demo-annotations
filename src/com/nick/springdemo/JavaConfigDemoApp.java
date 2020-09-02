package com.nick.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nick.springdemo.config.SportConfig;
import com.nick.springdemo.model.Coach;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		Coach aCoach = context.getBean("tennisCoach", Coach.class);
		Coach bCoach = context.getBean("someCoach", Coach.class);
		Coach cCoach = context.getBean("cricketCoach", Coach.class);
		Coach dCoach = context.getBean("trackCoach", Coach.class);
		Coach eCoach = context.getBean("swimCoach", Coach.class);
		
		System.out.println(aCoach.getDailyWorkout());
		System.out.println(bCoach.getDailyWorkout());
		System.out.println(cCoach.getDailyWorkout());
		System.out.println(dCoach.getDailyWorkout());
		System.out.println(eCoach.getDailyWorkout());
		
		context.close();
	}

}
