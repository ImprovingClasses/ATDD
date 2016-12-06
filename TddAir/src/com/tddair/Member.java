package com.tddair;


public class Member {
	
	private String userID;
	private String email;
	
	public Member(String u, String e) {
		setUserID(u);
		setEmail(e);
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getMileage()
	{
		return 0;
	}
}
