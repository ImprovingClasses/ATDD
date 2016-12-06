package com.tddair;

import java.util.ArrayList;

public class Membership {

	ArrayList<Member> memList;
	int numOfEmail;
	
	public Membership() {
		numOfEmail = 0;
		memList = new ArrayList<>();
	}
	
	public int getNumMembers() 
	{ 
		return memList.size(); 
	}
	
	public void addMember(String userID, String email)
	{
		memList.add(new Member(userID, email));
		// This method is flawed - we should be incrementing the names of emails
		// if the added email is completely new, not if it doesn't match any
		// of the existing emails in the list. If we add a new email to a list of two
		// distinct emails, this algorithm will increment numOfEmail twice.
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
