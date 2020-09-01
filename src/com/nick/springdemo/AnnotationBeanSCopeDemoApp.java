package com.nick.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nick.springdemo.model.Coach;

public class AnnotationBeanSCopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach coach = context.getBean("tennisCoach", Coach.class);

		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

		System.out.println("Comparison:" +(coach==alphaCoach));

		context.close();
	}

}

/*
 * Singleton
 * Tennis Coach created
 * Comparison:true
 */

/*
 * prototype
 * Tennis Coach created
 * Tennis Coach created
 * Comparison:false
 */
