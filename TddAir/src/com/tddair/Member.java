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
	
	public void addMiles(int milesToAdd) {
		this.miles += milesToAdd;
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
	
	public String getStatus(){
		String status="Red";
		if(miles >=75000) status = "Gold";
		else if (miles >= 50000 ) status = "Blue";
		else if (miles >= 25000 ) status = "Green";
	return status;
	}
}
