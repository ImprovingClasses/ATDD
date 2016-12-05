package com.tddair;

public class Member {
	public Member(){
		
	}
	
	public Member(String userId, String email){
		this.user_id = userId;
		this.email = email;
	}
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String user_id;
	private String email;
	
	
}
