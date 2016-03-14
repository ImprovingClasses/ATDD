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
	
	
	public void addMember(Member member) throws Exception {
		if (members.get(member.getUserName()) != null) {
			throw new Exception("Duplicate Member!");
		}
		members.put(member.getUserName(), member);
	}
	

}
