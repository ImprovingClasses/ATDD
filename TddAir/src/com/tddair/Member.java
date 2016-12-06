package com.tddair;

public class Member 
{
	private String userId;
	private String emailAddress;
	
	public Member(String userId, String emailAddress) throws IllegalArgumentException {
		if(userId == null || emailAddress == null) {
			throw new IllegalArgumentException("Member userId or emailAddress cannot be null.");
		}
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