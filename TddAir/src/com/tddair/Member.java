package com.tddair;

public class Member  {
	private MemberId memberId;
	private String userId;
	private String emailAddress;
	private int currentMiles;
	
	public Member(String userId, String emailAddress) throws IllegalArgumentException {
		if(userId == null || emailAddress == null) {
			throw new IllegalArgumentException("Member userId or emailAddress cannot be null.");
		}
		this.userId = userId;
		this.emailAddress = emailAddress;
		
		memberId = new MemberId(userId, emailAddress);
		
		this.currentMiles = 0;
	}
	
	public Member(String userId, String emailAddress, int miles) throws IllegalArgumentException {
		if(userId == null || emailAddress == null) {
			throw new IllegalArgumentException("Member userId or emailAddress cannot be null.");
		}
		this.userId = userId;
		this.emailAddress = emailAddress;
		this.currentMiles = miles;
	}

	public void addMiles(int mileage) {
		this.currentMiles += mileage;
	}
	
	public int getMiles() {
		return this.currentMiles;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public String getEmailAddress() {
		return this.emailAddress;
	}
	
	public MemberId getMemberId() {
		return this.memberId;
	}
}