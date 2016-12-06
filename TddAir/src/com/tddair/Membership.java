package com.tddair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Membership {

	private HashMap<String, ArrayList<Member>> members = new HashMap<String, ArrayList<Member>>();
	private int emailOnlyCount = 0;
	private int memberCount = 0;

	public int enrollmentCount() {
		return members.size();
	}

	public HashMap<String, ArrayList<Member>> getMembershipMap() {
		return members;
	}

	public boolean addNewMember(String userID, String emailAddress, int miles) {
		if (addNewMember(userID, emailAddress)) {
			List<Member> members = getMember(emailAddress);
			for (Member member : members) {
				if (member.getUserId().equals(userID)) {
					member.addMiles(miles);
				}
			}
			return true;
		} else {
			return false;
		}
	}

	public boolean addNewMember(String userID, String emailAddress) {
		boolean result = true;

		if (emailAddress == null) {
			return false;
		}

		if ((userID == null) || (userID.trim().isEmpty())) {
			emailOnlyCount += 1;
		} else {
			memberCount += 1;
		}

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

	public int getEmailOnlyCount() {
		return this.emailOnlyCount;
	}

	public int getMemberCount() {
		return this.memberCount;
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
