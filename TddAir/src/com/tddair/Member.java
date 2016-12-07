package com.tddair;


public class Member {
	
	private String userID;
	private String email;
	private int mileage = 0;
	private int currentMileage = 0;
	private String status = "Red";
	
	public Member(String u, String e) {
		setUserID(u);
		setEmail(e);
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getMileage()
	{
		return mileage;
	}
	
	public int getCurrentMileage()
	{
		return currentMileage;
	}
	
	public void addMiles(int miles)
	{
		mileage += miles;
		currentMileage += miles;
		calcStatus();
	}
	
	public String getStatus()
	{
		return status;
	}
	
	public void yearOver()
	{
		recalcStatus();
		currentMileage = 0;
	}
	
	private void calcStatus()
	{
		if (currentMileage >= 75000)
			status = "Gold";
		else if (currentMileage >= 50000)
		{
			if (!status.equals("Gold"))
				status = "Blue";
		}
		else if (currentMileage >= 25000)
		{
			if ((!status.equals("Gold")) && (!status.equals("Blue")))
				status = "Green";
		}
	}
	
	private void recalcStatus()
	{
		if (status.equals("Gold"))
		{
			if (currentMileage >=75000)
				status = "Gold";
			else
				status = "Blue";
		} else if (status.equals("Blue"))
		{
			if (currentMileage >= 50000)
				status = "Blue";
			else
				status = "Green";
		} else if (status.equals("Green"))
		{
			if (currentMileage >=25000)
				status = "Green";
			else
				status = "Red";
		}
		else
			status = "Red";
	}
	
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	public void bookFlight(Flight f)
	{
		if (f.getFullFlightNumber().startsWith("TD"))
			addMiles(f.getMileage());
	}
}
