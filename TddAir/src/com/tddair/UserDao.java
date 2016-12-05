package com.tddair;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UserDao {
	
	private Map<String, String> userToEmail = new HashMap<>();
	private Map<String, Set<String>> emailToUsers = new HashMap<>();
	
	public void addUser(String userId, String emailAddress) {
		if(doesUserIdExist(userId) == false) {
			userToEmail.put(userId, emailAddress);
			addUserToEmail(userId, emailAddress);
		}
	}
	
	private void addUserToEmail(String userId, String emailAddress) {
		if(emailToUsers.containsKey(emailAddress) == false) {
			emailToUsers.put(emailAddress, new HashSet<String>());
		}
		emailToUsers.get(emailAddress).add(userId);
	}
	
	public boolean doesUserIdExist(String userId) {
		return userToEmail.containsKey(userId);
	}
	
	public boolean doesEmailAddressExist(String emailAddress) {
		return emailToUsers.containsKey(emailAddress);
	}
}