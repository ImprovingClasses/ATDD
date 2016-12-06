package com.tddair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Membership {
	HashMap<String, String> members = new HashMap<String, String>();
	List<Member> memberlist = new ArrayList<Member>();

	int membercount = 0;
	public int getEnrollmentCount() {
		return  members.size();
	}
	
	
	public void add(Member m){
		if (m.getEmail() != null && !members.containsKey(m.getEmail())){
		members.put(m.getUserID(), m.getEmail()) ;
		setMemberList (m);
		}
	}
	
	public List<Member> getMemberList() {
		return memberlist;
	}
	
	public void setMemberList(Member member) {
			memberlist.add(member);
	}


}
