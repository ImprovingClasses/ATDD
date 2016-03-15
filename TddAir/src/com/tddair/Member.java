package com.tddair;

public class Member {
	
	public Member() {}
	
	public Member(String email, String username) {
		this.username = username;
		this.email = email;
	}
	
	private String username;
	private String email;
	private String status = "Red";

	public String getUserName() {
		return username;
	}

	public void setUserName(String id) {
		this.username = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
}
