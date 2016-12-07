package com.tddair;

public class UpgradeTransaction {
	int bought;
	int spent;
	
	public UpgradeTransaction(int bought, int spent)
	{
		setBought(bought);
		setSpent(spent);
	}
	
	public void setBought(int bought)
	{
		this.bought = bought;
	}
	
	public void setSpent(int spent)
	{
		this.spent = spent;
	}
	
	public int getBought()
	{
		return bought;
	}
	
	public int getSpent()
	{
		return spent;
	}
}
