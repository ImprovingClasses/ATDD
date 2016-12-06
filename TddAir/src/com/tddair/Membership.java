package com.tddair;

import java.util.ArrayList;
import java.util.List;

public class Membership {
    List<Member> members = new ArrayList<Member>();
    
    public int getMembershipCount()
    {
    	return members.size();
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
    
    public boolean addMilesToMember(String Id, int miles){
    	boolean done=false;
    	Member m = getById(Id);
    	if (m != null){
    		m.addMiles(miles);
    		done = true;
    	}
    	return done;
    }
}
