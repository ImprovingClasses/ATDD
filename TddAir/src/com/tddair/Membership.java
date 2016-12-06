package com.tddair;

import java.util.ArrayList;
import java.util.List;

public class Membership {
    List<Member> members = new ArrayList<Member>();
    
    public int getMembershipCount()
    {
    	return members.size();
    }
    
    public boolean addNewMember(String Id, String email){
    	boolean added = false;
    	if (email.isEmpty())
    	{
    		Member m = new Member(Id,email);
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
}
