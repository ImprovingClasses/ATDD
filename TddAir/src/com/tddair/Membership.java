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

	public boolean addMember(String userId, String email){
		if( email == null || email.isEmpty() )
			return false;

		if(userId == null || userId.isEmpty())
			members.put(email,new Member(email, email));
		else
			members.put(userId, new Member(userId, email));
		return true;
	}

	public Member getmemberByUserId(String userId){
		return members.get(userId);
	}


	public boolean isMember(String userId){
		System.out.println( "Membership.isMember(); userID =" + userId);
		return members.containsKey(userId);
	}


	/*public Member getmemberByEmailId(String email){
		//return members.values()getClass().;
	}*/

}
