package com.tddair;

import java.util.ArrayList;
import java.util.HashMap;

public class Membership {

	private HashMap<String, ArrayList<Member>> members = new HashMap<String, ArrayList<Member>>();

	public int enrollmentCount() {
		return members.size();
	}

	public boolean addNewMember(String userID, String emailAddress) {
		boolean result = true;

		if (members.containsKey(emailAddress)) {
			if (containsID(members.get(emailAddress), userID)) {
				result = false;
			} else {
				members.get(emailAddress).add(new Member(userID, emailAddress));
			}
		} else {
			ArrayList<Member> list = new ArrayList<Member>();
			list.add(new Member(userID, emailAddress));
			members.put(emailAddress, list);
		}
		return result;
	}

	public ArrayList<Member> getMember(String emailAddress) {
		return members.get(emailAddress);
	}

	private boolean containsID(ArrayList<Member> memberList, String memberID) {
		boolean result = false;
		for (Member member : memberList) {
			if (member.getUserId().equals(memberID)) {
				result = true;
				break;
			}
		}
		return result;
	}

}
