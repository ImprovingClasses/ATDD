package com.tddair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MemberDao {
	
	private ArrayList<Member> members = new ArrayList<Member>();
	private Map<String, String> userToEmail = new HashMap<>();
	private Map<String, Set<String>> emailToUsers = new HashMap<>();
	
	private static MemberDao instance = new MemberDao();
	
	private MemberDao() {
		if(instance == null) { 
			instance = this;
		}
	}
	
	public static MemberDao getInstance() {
		return instance;
	}
	
	void cleanUp()
	{
		members.clear();
		userToEmail.clear();
		emailToUsers.clear();
	}
	
	public void addMember(Member member) {
		members.add(member);
		addUser(member.getUserId(), member.getEmailAddress());
	}
	
	private void addUser(String userId, String emailAddress) {
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
	
	public int memberShipCount() {
		return members.size();
	}
	
	public Member getMemberByUserId(String userId)
	{
		for(Member member : members)
		{
			if (member.getUserId().equals(userId))
			{
				return member;
			}
		}
		
		// Return null if userId is not in membes list
		return null;
	}
}
