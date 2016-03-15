package com.tddair;

public class Member {
	
	public Member() {}
	
	public Member(String username, String email) {
		this.username = username;
		this.email = email;
	}
	
	public enum statusCodes { RED, GREEN, BLUE, GOLDEN }
	
	private String username;
	private String email;
	private statusCodes status = statusCodes.RED;
	private int miles = 0;
	
	public int getMiles()
	{
		return miles;
	}
	
	public void addMiles(int newMiles) {
		
		miles += newMiles;
		
		if (miles < 25000) {
			status = statusCodes.RED;
		}
		else if (miles >= 25000 && miles < 50000) {
			status = statusCodes.GREEN;
		}
		else if (miles >= 50000 && miles < 75000) {
			status = statusCodes.BLUE;
		}
		else if (miles >= 75000) {
			status = statusCodes.GOLDEN;
		}
		
		System.out.println(status.toString());
		
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

	public statusCodes getStatus() {
		return status;
	}
	
	
	
	
	
}
