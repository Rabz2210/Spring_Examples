package com.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cricket")
public class Cricket implements GetDailyPractice{

	@Autowired
	@Qualifier("weeklyfortune")
	private GetDailyFortune thefortune;
	
	
	public Cricket () {
		
		System.out.println("inside default constructor of cricket");
	}
	
	@Override
	public String getDailyPractice() {
	
		return "Try hitting a six";
	}
	
	public String getThefortune() {
		return thefortune.getDailyFortune()+"For CRICKET";
	}

}
