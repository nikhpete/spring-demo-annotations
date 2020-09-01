package com.nick.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nick.springdemo.model.Coach;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach aCoach = context.getBean("tennisCoach", Coach.class);
		Coach bCoach = context.getBean("someCoach", Coach.class);
		
		System.out.println(aCoach.getDailyWorkout());
		System.out.println(bCoach.getDailyWorkout());
		
		context.close();
	}

}
