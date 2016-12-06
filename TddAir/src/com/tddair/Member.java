package com.tddair;

import java.util.HashMap;

public class Member {
	
	private String userID;
	private String email;
	private int miles;
	
	public Member(String userID, String email, int miles)
	{
		this.userID = userID;
		this.email = email;
		this.miles = miles;
	}
	
	public Member(){
		
	}
	
	
	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	public Member(String email, String userID) {
		this.userID = userID;
		this.email = email;
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
	
	

}
