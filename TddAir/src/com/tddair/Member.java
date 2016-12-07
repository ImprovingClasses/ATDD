package com.tddair;

public class Member {
	public Member(){
		
	}
	
	public Member(String userId, String email, int initialMiles ){
		this.user_id = userId;
		this.email = email;
		this.currentMiles = initialMiles;
		this.points += initialMiles;
	}
	
	public Member(String userId, String email, int initialMiles,
			int points, String initialStatus ){
		this.user_id = userId;
		this.status = initialStatus;
		this.email = email;
		this.currentMiles = initialMiles;
		this.points = points;
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
		this.currentMiles += miles;
	}
		
	public String getStatus() {
		return status;
	}

	public void setStatus(String rewardLevel) {
		this.status = rewardLevel;
	}

	public int getMiles() {
		return currentMiles;
	}

	public void resetMiles() {
		this.currentMiles = 0;

	}
	
	public int getPoints() {
		return points;
	}

	private int currentMiles = 0;
	private int points = 0;
	private String user_id;
	private String email;
	private String status;
//	private String rewardLevel = "";
	
	
}
