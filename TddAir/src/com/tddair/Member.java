package com.tddair;

public class Member {
	private String userId = null;
	private String emailAddress = null;
	private int mileage = 0;
	private int yrMileage = 0;
	private StatusEnum _status = StatusEnum.Red;

	public Member(String userId, String emailAddress, int miles) {
		super();
		this.userId = userId;
		this.emailAddress = emailAddress;
		this.mileage = miles;
		this.yrMileage = miles;
		determineStatus();
	}
	
	public Member(String userId, String emailAddress) {
		super();
		this.userId = userId;
		this.emailAddress = emailAddress;
	}

	public Member(String userId, String emailAddress, StatusEnum currentStatus) {
		super();
		this.userId = userId;
		this.emailAddress = emailAddress;
		_status = currentStatus;
	}

	public int getMileage() {
		return mileage;
	}

	public String getStatus() {
		return _status.name();
	}

	public void addMiles(int miles) {
		mileage += miles;
		yrMileage += miles;
		determineStatus();
	}

	public String getUserId() {
		return userId;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void resetYrMiles()
	{
		yrMileage = 0;
	}
	
	public int getYrMiles()
	{
		return yrMileage;
	}
	
	
	public void rollYear()
	{
		Status statusHelper = new Status();
		_status = statusHelper.checkStatusForChange(statusHelper.getStatusForMiles(yrMileage), _status);
		resetYrMiles();
	}
	
	
	private void determineStatus() {
		if (0 <= mileage && mileage <= 24999) {
			_status = StatusEnum.Red;
		} else if (25000 <= mileage && mileage <= 44999) {
			_status = StatusEnum.Green;
		} else if (50000 <= mileage && mileage <= 74999) {
			_status = StatusEnum.Blue;
		} else if (75000 <= mileage) {
			_status = StatusEnum.Gold;
		}
	}
}
