package com.tddair;

public class Member {
	
	String identifier;
	String email;
	private int yearToDateMiles;
	Status status = Status.Red;

	public Member(String identifier, String email) {
		this(identifier, email, 0);
	}

	public Member(String identifier, String email, int miles) {
		this.identifier = identifier;
		this.email = email;
		this.yearToDateMiles = miles;
	}

	public String getIdentifier() {
		return identifier;
	}

	public String getEmail() {
		return email;
	}
	
	public int getYearToDateMiles(){
		return yearToDateMiles;
	}

	public void addMiles(int miles) {
		yearToDateMiles += miles;
		
		if(yearToDateMiles <25000){
			status = Status.Red;
		}
		else if( yearToDateMiles < 50000){
			status = Status.Green;
		}
		else if( yearToDateMiles < 75000){
			status = status.Blue;
		}
		else {
			status = status.Gold;
		}
		
	}

	public Status getStatus() {
		return status;
	}

}
