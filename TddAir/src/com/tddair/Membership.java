package com.tddair;

import java.util.*;

public class Membership {
	
	//private ArrayList<Member> myMembers;
	private int memberCount = 0;
	
	public Membership() {
		//myMembers = new ArrayList<>();
	}
	
	public int getMemebersCount() {
		return memberCount;
	}
	
	public void addMember(Member newMember){
		memberCount++;
	}
}
