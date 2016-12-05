package com.tddair;

public class Membership {

	int size;
	Member m1;
	
	public Membership() {
		size = 0;
		m1 = null;
	}
	
	public int getNumMembers() { return size; }
	
	public void addMember(String userID, String email)
	{
		size++;
		m1 = new Member(userID, email);
	}
	
	public Member getMember(String userID)
	{
		
		
		return m1;
		
	}
}
