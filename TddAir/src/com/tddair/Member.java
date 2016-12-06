package com.tddair;

public class Member {
	String id;
	String email;
	int miles;
	
	public Member(String id, String email){
		this.id=id;
		this.email= email;
		this.miles=0;
	}
	
	public Member(String id, String email, int miles){
		this.id=id;
		this.email= email;
		this.miles = miles;
	}
	
	public int getMiles() {
		return miles;
	}
	public void setMiles(int miles) {
		this.miles = miles;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
