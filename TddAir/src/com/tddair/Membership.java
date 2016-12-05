package com.tddair;

public class Membership {

	int size;
	
	public Membership() {
		size = 0;
	}
	
	public int getNumMembers() { return size; }
	
	public void addMember(String userID, String email)
	{
		size++;
	}
	
	public Member getMember(String userID)
	{
		return null;
	}
}
