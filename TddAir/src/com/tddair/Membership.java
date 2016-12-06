package com.tddair;

import java.util.*;

public class Membership {
	
	Member oneMember;
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
		oneMember = newMember;
	}
	
	public Member getMemberById(String userId) {
		return oneMember;
	}
}
