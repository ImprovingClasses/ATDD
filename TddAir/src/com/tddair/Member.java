package com.tddair;

public class Member {
	

	public Member(String username, String email)  {
		username_ = username;
		email_ = email;
		mileage_ = 0;
	}

	
	public String getUsername_() {
		return username_;
	}

	public void setUsername_(String username_) {
		this.username_ = username_;
	}

	public String getEmail_() {
		return email_;
	}

	public void setEmail_(String email_) {
		this.email_ = email_;
	}
	
	public void addMileage(int newMileage)
	{
		mileage_ = mileage_ + newMileage;
	}
	
	public int getMileage_() {
		return mileage_;
	}

	private String username_ = "";
	private String email_ = "";
	private int mileage_ = 0;
}
