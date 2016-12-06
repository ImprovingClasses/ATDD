package com.tddair;

import java.util.HashMap;

public class Member {
	
	private String userID;
	private String email;
	
	
	public Member(String email, String userID) {
		this.userID = userID;
		this.email = email;
	}
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		userID = userID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
