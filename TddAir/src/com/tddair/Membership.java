package com.tddair;

import java.util.HashMap;

public class Membership {
	//HashMap<String, String> members = new HashMap<String, String>();

	int membercount = 0;
	public int getEnrollmentCount() {
		return  membercount;
	}
	
	/*public void Memberhip(Member m){
	 Member tDDMember = new Member();
	 tDDMember.getUserID();
	 tDDMember.getEmail();
	}*/
	
	public void add(Member m){
		//m.getUserID();
		//m.getEmail();
		membercount++; 
	}


}
