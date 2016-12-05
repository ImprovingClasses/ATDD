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
    	Member m = new Member(Id,email);
    	if(m != null){
    		members.add(m);
    		return true;
    	}
    	return false;
    }
}
