package com.tddair;

public class Member {
	private String userId = null;
	private String emailAddress = null;
	
	
	public Member(String userId, String emailAddress) {
		super();
		this.userId = userId;
		this.emailAddress = emailAddress;
	}
	
	
	public String getUserId() {
		return userId;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	
	
}
