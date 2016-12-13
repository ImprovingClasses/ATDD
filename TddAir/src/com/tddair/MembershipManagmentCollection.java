package com.tddair;

public class MembershipManagmentCollection {
    
    int memberCount = 0;
    
    public int enrollmentCount(){
        return memberCount;
    }

    public void enroll(String string, String string2) {
        memberCount++;
    }

    public Member getMember(String identifier) {
        
        return new Member();
    }
    
    
}
