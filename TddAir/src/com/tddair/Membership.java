package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class Membership {
	
	Map<String, Member> members = new HashMap<String, Member>();

	public int enrollmentCount() {
		
		return members.size();
	}

	public void enroll(String memberIdentifier, String email) {
		members.put( memberIdentifier, new Member(memberIdentifier, email));		
	}

	public Member getMember(String memberIdentifier) {

		return members.get(memberIdentifier);
	}

}
