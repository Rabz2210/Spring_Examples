package com.Spring;

import org.springframework.stereotype.Component;

@Component("dailyfortune")
public class DailyFortune implements GetDailyFortune{

	@Override
	public String getDailyFortune() {
	
		return "Daily Fortune Service in Action";
	}
	

}
