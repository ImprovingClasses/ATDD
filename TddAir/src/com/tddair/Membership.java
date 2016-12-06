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
	
	
	public boolean add(Member m){
		if (m.getEmail() != null && (m.getEmail() != "") && !members.containsValue(m.getEmail())){
		members.put(m.getUserID(), m.getEmail()) ;
		setMemberList (m);
		return true;
		}
		else
		{
			return false;
		}
	}
	
	public List<Member> getMemberList() {
		return memberlist;
	}
	
	public void setMemberList(Member member) {
			memberlist.add(member);
	}


}
