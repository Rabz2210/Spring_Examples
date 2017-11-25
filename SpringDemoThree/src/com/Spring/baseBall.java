package com.Spring;

public class baseBall implements GetDailyPractice{

	private GetDailyFortune thefortune;
	private String name;
	private int no;
	
	public baseBall(GetDailyFortune fortune) {
		thefortune = fortune;
	}
	
	@Override
	public String getDailyPractice() {
		
		return "try hitting a home run";
	}

	public String getThefortune() {
		return thefortune.getDailyFortune()+"for Baseball";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
	


}
