package com.tddair;

import java.util.ArrayList;
import java.util.HashMap;

public class Membership {

	private HashMap<String, ArrayList<Member>> members = new HashMap<String, ArrayList<Member>>();

	public int enrollmentCount() {
		return members.size();
	}

	public void addNewMember(String userID, String emailAddress) {
		if (members.containsKey(emailAddress)) {
			members.get(emailAddress).add(new Member(userID, emailAddress));
		} else {
            ArrayList<Member> list = new ArrayList<Member>();
            list.add(new Member(userID, emailAddress));
            
            members.put(emailAddress, list);
		}
	}

	public ArrayList<Member> getMember(String emailAddress) {
		return members.get(emailAddress);
	}

}
