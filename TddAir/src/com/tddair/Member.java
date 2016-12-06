package com.tddair;


public class Member {
	
	private String userID;
	private String email;
	private int mileage = 0;
	private String status = "Red";
	
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
		return mileage;
	}
	
	public void addMiles(int miles)
	{
		mileage += miles;
		if (mileage>=25000)
			status = "Green";
	}
	
	public String getStatus()
	{
		return status;
	}
}
