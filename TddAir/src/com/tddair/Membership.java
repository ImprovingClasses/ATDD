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
	
	public void addMember(String userID, String email)
	{
		if (!userID.equals(""))
		{
			memList.add(new Member(userID, email));
		}
		emailList.add(email);
					
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
}
