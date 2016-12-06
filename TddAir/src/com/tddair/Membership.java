package com.tddair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Membership {
	HashMap<String, String> members = new HashMap<String, String>();
	List<Member> memberlist = new ArrayList<Member>();

	int membercount = 0;
	Status memStatus = Status.Red;
	
	public enum Status {
		Red, 
		Green, 
		Blue, 
		Gold
	}
	
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
	
	public Status membershipLevel(Member m)
	{
		if (m.getMiles() <25000)
		{
			memStatus = Status.Red;
		}
		else if (m.getMiles() >=25000 && m.getMiles() < 50000)
		{
			memStatus = Status.Green;
		} 
		else if (m.getMiles() >=50000 && m.getMiles() < 75000)
		{
			memStatus = Status.Blue;
		}
		else if (m.getMiles() >= 75000)
		{
			memStatus = Status.Gold;
		}
		 return memStatus;	
			
	}
	
	public void addMiles(String user, int miles){
		for (int i =0; i < memberlist.size(); i++){
			 Member member = memberlist.get(i);
			 if (member.getUserID() == user)
			 {
				 int memMiles = member.getMiles();
				 memMiles = memMiles + miles;
				 member.setMiles(memMiles);
			 }
			 
			
			
				
		}
		
	}
	
	public Status getMemberStatus(){
		return memStatus;
	}
	
	


}
