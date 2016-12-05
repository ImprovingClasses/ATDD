package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class Membership {
	
	private Map<String, Member> members = new HashMap<String, Member>();
	
	public Membership(){
		
	}
	
	public Membership(String arg1, String arg2){
		members.put(arg1, new Member(arg1, arg2));
	}
	
	public int enrollmentCount(){
		return members.size();
	}
	
	public void addMember(String userId, String email){
		members.put(userId, new Member(userId, email));
	}
	
	public Member getmemberByUserId(String userId){
		return members.get(userId);
	}
	
	/*public Member getmemberByEmailId(String email){
		//return members.values()getClass().;
	}*/

}
