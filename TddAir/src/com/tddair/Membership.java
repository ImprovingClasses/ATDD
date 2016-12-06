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
		myMembers.add(newMember);
	}
	
	public Member getMemberById(String userId)throws Exception {
		for(Member member : myMembers){
			if (member.getUserId().equals(userId)){
				return member;
			}
		}
		throw new Exception("Member Id not Found");
	}
}
