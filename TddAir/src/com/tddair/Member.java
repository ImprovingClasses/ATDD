package com.tddair;

public class Member {

	public Member(String userId, String email) {
		setEmail(email);
		setUserId(userId);
	}
	
	private String email;
	private String userId;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
