package com.tddair;

import java.util.ArrayList;
import java.util.HashSet;

public class Membership {

	ArrayList<Member> memList;
	HashSet<String> emailList;
	
	public Membership() {
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
			memList.add(new Member(userID, email));
		}
		return true;
	}
	
	public Member getMember(String userID)
	{	
		for (Member member : memList)
		{
			if (member.getUserID() == userID)
					return member;
		}
		
		return null;
	}
	
	public int getNumEmails() {
		return emailList.size();
	}
	
	public void addMemberMiles(String userID, int miles)
	{
		Member member = getMember(userID);
		if (member != null)
			member.addMiles(miles);
	}
	
	public String getMemberStatus(String userID)
	{
		Member member = getMember(userID);
		if (member != null)
			return member.getStatus();
		else 
			return "Unknown User";
	}
	
	public void bookFlight(String userID, Flight flight)
	{
		getMember(userID).bookFlight(flight);
	}
	
	public void yearOver()
	{
		for (Member member : memList)
		{
			member.yearOver();
		}
	}
	
	public int getMemberMiles(String userID)
	{
		return getMember(userID).getMileage();
	}
	
	public int getMemberCurrentMiles(String userID)
	{
		return getMember(userID).getCurrentMileage();
	}
	
	public void setMemberStatus(String user, String status)
	{
		getMember(user).setStatus(status);
	}
}
