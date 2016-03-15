package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class Membership {
	
	
	private Map<String, Member> members = new HashMap<String, Member>();

	public int getCount() {
		return members.size();
	}
	

	public Member getMemberById(String id) {

		Member result = null;
		result = members.get(id);
		return result;

	}
	
	public void addFlightForMember(Member member, Flight flight)
	{
		Member myMember = this.getMemberById(member.getUserName());
		
		myMember.addMiles(flight.getMileage());
				
	}
	
	
	public void addMember(Member member) throws Exception {
		
		if(member == null) {
			throw new Exception("Cannot create null Member");
		}
		
		Member existingMember = members.get(member.getUserName());
		if (existingMember != null) {
			// We allow a duplicate username IF the email address is different
			if (member.getEmail().equals(existingMember.getEmail())) {

				throw new Exception("Duplicate Member!");
			}
		}
		
		
		
		members.put(member.getUserName(), member);
	}
	
	
	public boolean memberAlreadyRegistered(Member newMember) {

		boolean result = false;

		Member existingMember = members.get(newMember.getUserName());
		if (existingMember != null) {
			// We allow a duplicate username IF the email address is different
			if (newMember.getEmail().equals(existingMember.getEmail())) {

				result = true;
			}
		}
			return result;
		
	}
	

}
