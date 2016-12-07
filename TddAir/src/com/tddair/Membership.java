package com.tddair;

import java.util.ArrayList;
import java.util.List;

public class Membership {
    List<Member> members = new ArrayList<Member>();
    
    public int getMembershipCount()
    {
    	return members.size();
    }
    
    public boolean addNewMember(String Id, String email, int miles, String status){
    	boolean added = false;
    	if (!email.isEmpty())
    	{
    		Member m = new Member(Id,email,miles,status);
    		if(m != null){
    			if (getById(Id) == null)
    			{
    				members.add(m);
    				added = true;
    			}
    		}
    	}
    	return added;
    }
    
    public boolean addNewMember(String Id, String email, int miles){
    	boolean added = false;
    	if (!email.isEmpty())
    	{
    		Member m = new Member(Id,email,miles);
    		if(m != null){
    			if (getById(Id) == null)
    			{
    				members.add(m);
    				added = true;
    			}
    		}
    	}
    	return added;
    }
    
    public boolean addNewMember(String Id, String email){
    	return addNewMember(Id, email, 0);
    }
    
    public Member getById(String id){
    	for (Member member : members) {
    		if (member.getId().equals(id)){
    			return member;
    		}
    	}
    	return null;
    }
    
    public Member getByEmail(String email){
    	for (Member member : members) {
    		if (member.getEmail().equals(email)){
    			return member;
    		}
    	}
    	return null;
    }
    
    public String addMilesToMember(String Id, int miles){
    	String status = "Undefined Status";
    	Member m = getById(Id);
    	if (m != null){
    		m.addMiles(miles);
    		status = m.calcStatus();
    	}
    	return status;
    }
    
    public String getStatusFromId(String Id) {
    	String status = "Undefined Status";
    	Member m = getById(Id);
    	if (m != null) {
    		status = m.calcStatus();
    	}
    	return status;
    }
    
    public int getMilesFromId(String Id) {
    	int miles = -1;
    	Member m = getById(Id);
    	if (m != null) {
    		miles = m.getTotalMiles();
    	}
    	return miles;
    }
    
    public void newYearMemberUpdate(){
    	for (Member member : members) {
    		int yTDMiles = member.getyTDMiles();
    		String curStatus = member.getStatus();
    		if (curStatus.equals("Gold")) {
    			if (yTDMiles < 75000) {
    				member.setStatus("Blue");
    			}
    		} else if (curStatus.equals("Blue")) {
    			if (yTDMiles < 50000) {
    				member.setStatus("Green");
    			}
    		} else if (curStatus.equals("Green")) {
    			if (yTDMiles < 25000) {
    				member.setStatus("Red");
    			}
    		}
            member.setyTDMiles(0);
    	}
    }
}
