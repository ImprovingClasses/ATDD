package com.tddair;

import java.util.ArrayList;

public class Membership {

	ArrayList<Member> memList;
	int numOfEmail;
	
	public Membership() {
		int numOfEmail = 0;
		memList = new ArrayList<>();
	}
	
	public int getNumMembers() 
	{ 
		return memList.size(); 
	}
	
	public void addMember(String userID, String email)
	{
		memList.add(new Member(userID, email));
		if (memList.size() == 0)
			numOfEmail = 0;
		else
			for (Member member: memList) {
				if (member.getEmail() != email) {
					numOfEmail++;
					break;
				}
			}
					
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
		return numOfEmail;
	}
}
