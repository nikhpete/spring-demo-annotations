package com.nick.springdemo.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nick.springdemo.service.FortuneService;

@Component
public class TrackCoach implements Coach {

	//field injection
	@Autowired
	@Qualifier("dataBaseFortuneService")
	private FortuneService fs;

	@Override
	public String getDailyWorkout() {
		System.out.println(fs.getFortune());
		return "Run along 5k";
	}
	
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println("TrackCoach: Start up methods");
	}
	
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("TrackCoach: Closing the method");
	}

}
