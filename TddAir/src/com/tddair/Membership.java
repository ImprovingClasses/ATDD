package com.tddair;

import java.util.ArrayList;
import java.util.HashMap;

public class Membership {

	private HashMap<String, ArrayList<String>> members = new HashMap<String, ArrayList<String>>();

	public int enrollmentCount() {
		return members.size();
	}

	public void addNewMember(String userID, String emailAddress) {
		if (members.containsKey(emailAddress)) {
			members.get(emailAddress).add(userID);
		} else {
            ArrayList<String> list = new ArrayList<String>();
            list.add(userID);
            members.put(emailAddress, list);
		}
	}

}
