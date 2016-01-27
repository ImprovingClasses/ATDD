package com.tddair;

import java.util.ArrayList;
import java.util.List;

public class Membership {
	
	List<Member> members = new ArrayList<Member>();

	public int enrollmentCount() {
		
		return members.size();
	}

	public void enroll(String name, String email) {
		members.add(new Member());		
	}
	


}
