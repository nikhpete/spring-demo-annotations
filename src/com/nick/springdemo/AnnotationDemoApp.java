package com.nick.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nick.springdemo.model.Coach;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach aCoach = context.getBean("tennisCoach", Coach.class);
		Coach bCoach = context.getBean("someCoach", Coach.class);
		Coach cCoach = context.getBean("cricketCoach", Coach.class);
		Coach dCoach = context.getBean("trackCoach", Coach.class);
		
		System.out.println(aCoach.getDailyWorkout());
		System.out.println(bCoach.getDailyWorkout());
		System.out.println(cCoach.getDailyWorkout());
		System.out.println(dCoach.getDailyWorkout());
		
		context.close();
	}

}
