package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class Membership {
	
	
	private Map<String, Member> members = new HashMap<String, Member>();
	
	private int count = 0;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	

	public Member getMemberById(String id) {

		Member result = null;
		result = members.get(id);
		return result;

	}
	
	public void addMemberX(Member member) {
		members.put(member.getId(), member);
	}
	

}
