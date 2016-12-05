package com.tddair;

import java.util.ArrayList;

public class Membership {

	int size;
	Member m1;
	ArrayList<Member> memList;
	
	public Membership() {
		size = 0;
		m1 = null;
		memList = new ArrayList<>();
	}
	
	public int getNumMembers() { return size; }
	
	public void addMember(String userID, String email)
	{
		size++;
		m1 = new Member(userID, email);
		memList.add(m1);
	}
	
	public Member getMember(String userID)
	{	
		for (Member member : memList)
		{
			if (member.getUserID() == userID)
					return member;
		}
		
		return m1;
	}
	
	
}
