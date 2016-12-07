package com.tddair;

public class Member  {
	private MemberId memberId;
	private String userId;
	private String emailAddress;
	
	private MemberStatus status;
	
	private int currencyMiles;
	private int yearlyMiles;
	
	public Member(String userId, String emailAddress) throws IllegalArgumentException {
		this(userId, emailAddress, 0);
	}
	
	public Member(String userId, String emailAddress, int miles) throws IllegalArgumentException {
		if(userId == null || emailAddress == null) {
			throw new IllegalArgumentException("Member userId or emailAddress cannot be null.");
		}
		
		this.status = MemberStatus.RED;
		this.userId = userId;
		this.emailAddress = emailAddress;
		this.currencyMiles = miles;
		this.yearlyMiles = miles;
	}

	public void addMilesFlown(int mileage) {
		this.currencyMiles += mileage;
		this.yearlyMiles += mileage;
	}
	
	public int getYearlyMiles() {
		return this.yearlyMiles;
	}
	
	public int getCurrencyMiles() {
		return this.currencyMiles;
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
	
	public MemberStatus getMemberStatus() {
		return this.status;
	}
	
	public void setMemberStatus(MemberStatus newStatus) {
		this.status = newStatus;
	}
	
	public void resetYearlyMiles() {
		this.yearlyMiles = 0;
	}
}