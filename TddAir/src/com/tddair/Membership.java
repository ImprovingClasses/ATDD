package com.tddair;

import java.util.ArrayList;

public class Membership {

	ArrayList<Member> memList;
	
	public Membership() {
		memList = new ArrayList<>();
	}
	
	public int getNumMembers() 
	{ 
		return memList.size(); 
	}
	
	public void addMember(String userID, String email)
	{
		memList.add(new Member(userID, email));
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
	
	
}
