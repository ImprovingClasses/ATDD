package com.tddair;

public class Member {
	public Member(){
		
	}
	
	public Member(String userId, String email, int initialMiles ){
		this.user_id = userId;
		this.email = email;
		this.miles = initialMiles;
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
	
	public void addTravelMiles(int miles) {
		this.miles += miles;
	}
		
//	public String getRewardLevel() {
//		return rewardLevel;
//	}

//	public void setRewardLevel(String rewardLevel) {
//		this.rewardLevel = rewardLevel;
//	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	private int miles;
	private String user_id;
	private String email;
//	private String rewardLevel = "";
	
	
}
