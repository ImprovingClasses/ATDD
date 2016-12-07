package com.tddair;

import java.time.MonthDay;
import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Membership {
	HashMap<String, String> members = new HashMap<String, String>();
	List<Member> memberlist = new ArrayList<Member>();
	HashMap<String, Integer> userCurrentMiles = new HashMap<String, Integer>();
	HashMap<String, Status> userPreviousStatus = new HashMap<String, Status>();
	HashMap<String, Status> userNextStatus = new HashMap<String, Status>();

	int membercount = 0;
	Status memStatus = Status.Red;
	Status previousYearStatus = Status.Red;
	
	
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
			 
			// membershipLevel(member);
			
				
		}
		
	}
	
	public void userFlights(String user, Flight flight)
	{
		for (int i =0; i < memberlist.size(); i++){
			 Member member = memberlist.get(i);
			 if (member.getUserID() == user)
			 {
				 int memMiles = member.getMiles();
				 int miles = flight.getMileage();
				 memMiles = memMiles + miles;
				 member.setMiles(memMiles);
				 membershipLevel(member);
				 
			 }
		}
	}
	
	public void userFlightMiles(String user, List<Flight> flights)
	{
				int currentYearMiles = 0;
				 for (Flight e:flights)
				 {
				 int miles = e.getMileage();
				 currentYearMiles += miles;
				 
				 addMiles(user,miles);
				 userCurrentMiles.put(user, currentYearMiles);
				 setNextYearStatus(user);
				 
				 
				 }
				 
				 
			 
		
	}
	
	
	
	public Status getMemberStatus(){
		return memStatus;
	}


	public Status getPreviousStatus(String user) {
		for (int i =0; i < memberlist.size(); i++){
			 Member member = memberlist.get(i);
			 if (member.getUserID() == user)
			 {
				 
				 return userPreviousStatus.get(user);
			 }
		}
		return Status.Red;
		
	}


	public int getCurrentYearMiles(String user) {
		for (int i =0; i < memberlist.size(); i++){
			 Member member = memberlist.get(i);
			 if (member.getUserID() == user)
			 {
				 
				 return userCurrentMiles.get(user);
			 }
		}
		return 0;
		
		
	}


	public void setNextYearStatus(String user) {
		int year = Year.now().getValue();
		int month = MonthDay.now().getMonthValue();
		for (int i =0; i < memberlist.size(); i++){
			 Member member = memberlist.get(i);
			 if (member.getUserID() == user)
			 {
				 
				 int currMiles =  userCurrentMiles.get(user);
				 Status prevStatus = userPreviousStatus.get(user);
				 int totMiles = member.getMiles();
				 if (prevStatus == Status.Gold && currMiles < 75000 )
				 {
					 userNextStatus.put(user, Status.Blue);
				 }
				 else if (prevStatus == Status.Blue && currMiles < 50000 )
				 {
					 userNextStatus.put(user, Status.Green);
				 }
				 else if (prevStatus == Status.Green && currMiles < 25000 )
				 {
					 userNextStatus.put(user, Status.Red);
				 }
				 else 
				 {
					 userNextStatus.put(user, Status.Red);
				 }
			 }
		
	}
	
	
	}
	
	public Status getNextYearStatus(String user) {
		for (int i =0; i < memberlist.size(); i++){
			 Member member = memberlist.get(i);
			 if (member.getUserID() == user)
			 {
				 
				 return userNextStatus.get(user);
			 }
		}
		return Status.Red;
		
		
	}

}
