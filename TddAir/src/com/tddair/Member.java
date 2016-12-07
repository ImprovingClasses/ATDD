package com.tddair;

public class Member {
	String id;
	String email;
	int totalMiles;
	int yTDMiles;
	
	public Member(String id, String email){
		this.id=id;
		this.email= email;
		this.totalMiles=0;
	}
	
	public Member(String id, String email, int miles){
		this.id=id;
		this.email= email;
		this.totalMiles = miles;
	}
	
	public void addTotalMiles(int milesToAdd) {
		this.totalMiles += milesToAdd;
	}
	
	public int getTotalMiles() {
		return totalMiles;
	}
	public void setTotalMiles(int miles) {
		this.totalMiles = miles;
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
	
	public int getyTDMiles() {
		return yTDMiles;
	}

	public void setyTDMiles(int yTDMiles) {
		this.yTDMiles = yTDMiles;
	}

	public String getStatus(){
		String status="Red";
		if(totalMiles >=75000) status = "Gold";
		else if (totalMiles >= 50000 ) status = "Blue";
		else if (totalMiles >= 25000 ) status = "Green";
	return status;
	}
}
