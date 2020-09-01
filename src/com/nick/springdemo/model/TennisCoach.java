package com.nick.springdemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.nick.springdemo.service.FortuneService;

@Component()
@Scope("prototype")
public class TennisCoach implements Coach {

	private FortuneService fs;

	//	Constructor injection
	@Autowired
	public TennisCoach(@Qualifier("happyFortuneService")FortuneService fs) {
		System.out.println("Tennis Coach created");
		this.fs = fs;
	}



	@Override
	public String getDailyWorkout() {
		System.out.println(fs.getFortune());
		return "Practise your backhand vollley";
	}

}
