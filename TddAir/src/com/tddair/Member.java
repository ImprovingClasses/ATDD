package com.tddair;

public class Member {
	String id;
	String email;
	int totalMiles;
	int yTDMiles;
	String status;
	
	public Member(String id, String email){
		this.id=id;
		this.email= email;
		this.totalMiles=0;
		this.yTDMiles = 0;
		this.status = calcStatus();
	}
	
	public Member(String id, String email, int miles){
		this.id=id;
		this.email= email;
		this.totalMiles = miles;
		this.yTDMiles = miles;
		this.status = calcStatus();
	}

	public Member(String id, String email, int miles, String status){
		this.id=id;
		this.email= email;
		this.totalMiles = miles;
		this.yTDMiles = miles;
		this.status = status;
	}
	
	public void addMiles(int milesToAdd) {
		this.totalMiles += milesToAdd;
		this.yTDMiles += milesToAdd;
		if (this.status.equals("Blue")) {
			if (this.yTDMiles >= 75000) {
				this.status = "Gold";
			}
		} else if (this.status.equals("Green")) {
			if (this.yTDMiles >= 75000) {
				this.status = "Gold";
			} else if (this.yTDMiles >= 50000) {
				this.status = "Blue";
			}
		} else if (this.status.equals("Red")) {
			if (this.yTDMiles >= 75000) {
				this.status = "Gold";
			} else if (this.yTDMiles >= 50000) {
				this.status = "Blue";
			} else if (this.yTDMiles >= 25000) {
				this.status = "Green";
			}
		}
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
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return this.status;
	}

	private String calcStatus(){
		String status="Red";
		if(this.yTDMiles >=75000) status = "Gold";
		else if (this.yTDMiles >= 50000 ) status = "Blue";
		else if (this.yTDMiles >= 25000 ) status = "Green";
	    return status;
	}
}
