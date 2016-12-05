package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
	
	private Map<String, String> users = new HashMap<>();
	
	public UserDao() {
	}
	
	public String getUserById(String userId) {
		return users.get(userId);
	}
	
	public void addUser(String userId, String email) {
		users.put(userId, email);
	}
}
