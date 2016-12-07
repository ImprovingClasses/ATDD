package com.tddair;

public class Member {

	public Member(String userId, String email) {
		this.userId = userId;
		this.email = email;
	}
	
	private String email;
	private String userId;
	private int miles=0;
	private ColorStatusEnum colorStatus;
	
	public int getMiles() {
		return miles;
	}
	public void setMiles(int miles) {
		this.miles = miles;
	}
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
	public ColorStatusEnum getColorStatus() {
		return colorStatus;
	}
	public void setColorStatus(ColorStatusEnum colorStatus) {
		this.colorStatus = colorStatus;
	}
	
	
}
