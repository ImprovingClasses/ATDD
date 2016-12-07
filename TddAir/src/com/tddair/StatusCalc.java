package com.tddair;

public class StatusCalc {
	private RedStatus red = new RedStatus();
	private GreenStatus green = new GreenStatus();
	private BlueStatus blue = new BlueStatus();
	private GoldStatus gold = new GoldStatus();
	
	private static StatusCalc instance = null;
	
	public static synchronized StatusCalc getInstance()
	{
		if (instance == null)
		{
			instance = new StatusCalc();
		}
		
		return instance;
	}
	
	private StatusCalc()
	{
		
	}
	
	public Status calcStatus(int currentMileage, Status status)
	{
		Status newStatus = null;
		if (currentMileage >= 75000)
			newStatus = gold;
		else if (currentMileage >= 50000)
		{
			if (status.compareTo(gold) != 0)
				newStatus = blue;
		}
		else if (currentMileage >= 25000)
		{
			if ((status.compareTo(blue) < 0))
				newStatus = green;
		}
		else
			newStatus = status;
		return newStatus;
	}
	
	public Status recalcStatus(int currentMileage, Status status)
	{
		Status newStatus = null;
		if (status.compareTo(gold) == 0)
		{
			if (currentMileage >= 75000)
				newStatus = gold;
			else
				newStatus = blue;
		} else if (status.compareTo(blue) == 0)
		{
			if (currentMileage >= 50000)
				newStatus = blue;
			else
				newStatus = green;
		} else if (status.compareTo(green) == 0)
		{
			if (currentMileage >= 25000)
				newStatus = green;
			else
				newStatus = red;
		}
		else
			newStatus = red;
		
		return newStatus;
	}
	
	public Status provideStatus(String input)
	{
		switch(input)
		{
		case "Red":
			return red;
		case "Green":
			return green;
		case "Blue":
			return blue;
		case "Gold":
			return gold;
		default:
			return null;
		}
	}
}
