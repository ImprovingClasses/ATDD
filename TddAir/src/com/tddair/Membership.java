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
	
	public boolean addMember(Member newMember){
		//Loop though all of our current Members to check
		//for a potential duplicate.
		for(Member member : myMembers){
			if(member.getUserId().equals(newMember.getUserId())) {
				return false;
			}
		}
		
		//Add new member
		myMembers.add(newMember);
		return true;
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
