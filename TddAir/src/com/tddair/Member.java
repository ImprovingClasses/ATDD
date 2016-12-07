package com.tddair;

public class Member {
	private String userId = null;
	private String emailAddress = null;
	private int mileage = 0;
	private int yrMileage = 0;
	private String status = "Red";

	public Member(String userId, String emailAddress, int miles) {
		super();
		this.userId = userId;
		this.emailAddress = emailAddress;
		this.mileage = miles;
		this.yrMileage = miles;
		determineStatus();
	}
	
	public Member(String userId, String emailAddress) {
		super();
		this.userId = userId;
		this.emailAddress = emailAddress;
	}

	public int getMileage() {
		return mileage;
	}

	public String getStatus() {
		return status;
	}

	public void addMiles(int miles) {
		mileage += miles;
		yrMileage += miles;
		determineStatus();
	}

	public String getUserId() {
		return userId;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void resetYrMiles()
	{
		yrMileage = 0;
	}
	
	public int getYrMiles()
	{
		return yrMileage;
	}
	
	private void determineStatus() {
		if (0 <= mileage && mileage <= 24999) {
			status = "Red";
		} else if (25000 <= mileage && mileage <= 44999) {
			status = "Green";
		} else if (50000 <= mileage && mileage <= 74999) {
			status = "Blue";
		} else if (75000 <= mileage) {
			status = "Gold";
		}
	}
}
