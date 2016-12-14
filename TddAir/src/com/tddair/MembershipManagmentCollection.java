package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class MembershipManagmentCollection {
    
    Map<String, Member> members = new HashMap<String, Member>(); 
    
    public int enrollmentCount(){
        return members.size();
    }

    public boolean enroll(String identifier, String email) {
        if(members.get(identifier) == null){
            members.put(identifier, new Member(identifier, email));
            return true;
        }
        return false;
    }

    public Member getMember(String identifier) {
        return members.get(identifier);
    }

    public int getEmailCount() {
        return 0;
    }
    
    
}
