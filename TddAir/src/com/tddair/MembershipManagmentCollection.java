package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class MembershipManagmentCollection {
    
    Map<String, Member> members = new HashMap<String, Member>(); 
    
    public int enrollmentCount(){
        return members.size();
    }

    public void enroll(String identifier, String email) {
        members.put(identifier, new Member(identifier, email));
    }

    public Member getMember(String identifier) {
        return members.get(identifier);
    }
    
    
}
