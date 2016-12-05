package com.tddair;

public class Member 
{
	private String userId;
	private String emailAddress;
	
	Member(String userId, String emailAddress)
	{
		this.userId = userId;
		this.emailAddress = emailAddress;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public String getEmailAddress() {
		return this.emailAddress;
	}
}
