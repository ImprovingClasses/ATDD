package com.tddair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Membership {
	
	Map<String, Member> members = new HashMap<String, Member>();
	List<String> emailRecords = new ArrayList<String>();
	
	public int enrollmentCount() {
		
		return members.size();
	}

	public void enroll(String memberIdentifier, String email) {

		if( memberIdentifier == null || email == null){
			throw new IllegalArgumentException();
		}
		
		if(memberIdentifier.isEmpty()){
			emailRecords.add(email);
			return;
		}
		members.put( memberIdentifier, new Member(memberIdentifier, email));		
	}

	public Member getMember(String memberIdentifier) {

		return members.get(memberIdentifier);
	}

	public boolean isEmailRecorded(String emailAddress) {
		return emailRecords.contains(emailAddress);
	}

}
