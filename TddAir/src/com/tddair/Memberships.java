package com.tddair;

import java.util.ArrayList;
import java.util.HashSet;

public class Memberships {
	ArrayList<Membership> memList;
	HashSet<String> emailList;
	
	public Memberships() {
		memList = new ArrayList<>();
		emailList = new HashSet<>();
	}
	
	public int getNumMembers() 
	{ 
		return memList.size(); 
	}
	
	public boolean addMember(String userID, String email)
	{
		if (!email.equals(""))
		{
			emailList.add(email);
		}
		else
		{
			return false;
		}
		if (!userID.equals(""))
		{
			memList.add(new Membership(userID, email));
		}
		return true;
	}
	
	public Membership getMember(String userID)
	{	
		for (Membership member : memList)
		{
			if (member.getUserId() == userID)
					return member;
		}
		
		return null;
	}
	
	public int getNumEmails() {
		return emailList.size();
	}
	
	public void addMemberMiles(String userID, int miles)
	{
		Membership member = getMember(userID);
		if (member != null)
			member.addMiles(miles);
	}
	
	public Status getMemberStatus(String userID)
	{
		Membership member = getMember(userID);
		if (member != null)
			return member.getStatus();
		else 
			return null;
	}
	
	public void bookFlight(String userID, Flight flight)
	{
		Membership member = getMember(userID);
		if (member != null)
			getMember(userID).bookFlight(flight);
	}
	
	public void yearOver()
	{
		for (Membership member : memList)
		{
			member.yearOver();
		}
	}
	
	public int getMemberMiles(String userID)
	{
		Membership member = getMember(userID);
		if (userID != null)
			return member.getMileage();
		else
			return 0;
	}
	
	public int getMemberCurrentMiles(String userID)
	{
		Membership member = getMember(userID);
		if (member != null)
			return member.getCurrentMileage();
		else
			return 0;
	}
	
	public void setMemberStatus(String user, String status)
	{
		Membership member = getMember(user);
		if (member != null)
			member.setStatus(status);
	}
	
	public int buyUpgrades(String user, int count)
	{
		Membership member = getMember(user);
		if (member != null)
			return member.buyUpgrades(count);
		else
			return 0;
	}
	
	public int getUpgrades(String user)
	{
		Membership member = getMember(user);
		if (member != null)
			return member.getUpgrades();
		return 0;
	}
}
