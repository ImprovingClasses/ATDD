package com.tddair;

public class Membership {

	private Member member;
	private int mileage = 0;
	private int currentMileage = 0;
	private Status status = new RedStatus();
	private StatusCalc calc = StatusCalc.getInstance();
	private int upgrades = 0;
	
	public Membership(String userId, String email)
	{
		member = new Member(userId, email);
	}
	
	public void setUserId(String userId)
	{
		member.setUserID(userId);
	}
	
	public void setEmail(String email)
	{
		member.setEmail(email);
	}
	
	public String getUserId()
	{
		return member.getUserID();
	}
	
	public String getEmail()
	{
		return member.getEmail();
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
		status = calc.calcStatus(currentMileage, status);
	}
	
	public Status getStatus()
	{
		return status;
	}
	
	public void yearOver()
	{
		status = calc.recalcStatus(currentMileage, status);
		currentMileage = 0;
	}
	
	
	public void setStatus(String status)
	{
		this.status = calc.provideStatus(status);
	}
	
	public void bookFlight(Flight f)
	{
		if (f.getFullFlightNumber().startsWith("TD"))
			addMiles(f.getMileage());
	}
	
	public int buyUpgrades(int amount)
	{
		UpgradeTransaction transaction = status.buyUpgrades(amount, mileage);
		upgrades += transaction.getBought();
		mileage -= transaction.getSpent();
		return transaction.getBought();
	}
	
	public int getUpgrades()
	{
		return upgrades;
	}
}
