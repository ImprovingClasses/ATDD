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

	public boolean enroll(String memberIdentifier, String email) {
		return enroll(memberIdentifier, email, 0);
	}
	
	public boolean enroll(String memberIdentifier, String email, int miles) {
		if( memberIdentifier == null || email == null){
			throw new IllegalArgumentException();
		}
		
		if(memberIdentifier.isEmpty()){
			emailRecords.add(email);
			return false;
		}
		if (members.containsKey(memberIdentifier)){
			return false;
		}
		members.put( memberIdentifier, new Member(memberIdentifier, email, miles));
		return true;
	}
	
	public void enroll(Member member) {
		members.put(member.getIdentifier(), member);
	}

	public Member getMember(String memberIdentifier) {

		return members.get(memberIdentifier);
	}

	public boolean isEmailRecorded(String emailAddress) {
		return emailRecords.contains(emailAddress);
	}



	public void completeFlight(String memberIdentifier, int miles) {
		Member member = members.get(memberIdentifier);
		member.addMiles(miles);
	}



}
