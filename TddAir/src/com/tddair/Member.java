package com.tddair;

public class Member {
	
	public Member() {}
	
	public Member(String email, String username) {
		this.username = username;
		this.email = email;
	}
	
	private String username;
	private String email;
	private String status = "Red";
	private int miles = 0;
	
	public int getMiles()
	{
		return miles;
	}
	
	public void addMiles(int newMiles) {
		miles += newMiles;
		if (miles < 25000)
			status = "Red";
		else if (miles >= 25000 && miles < 50000)
			status = "Green";
		
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String id) {
		this.username = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
}
