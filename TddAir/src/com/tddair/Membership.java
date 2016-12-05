package com.tddair;

import java.util.*;

public class Membership {
	
	private ArrayList<Member> myMembers;
	
	public Membership() {
		myMembers = new ArrayList<>();
	}
	
	public int getMemebersCount() {
		return myMembers.size();
	}
	
	public void addMember(Member newMember){
		if (newMember.getEmail() == null){
			
		}
	}
}
