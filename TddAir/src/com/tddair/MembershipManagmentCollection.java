package com.tddair;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MembershipManagmentCollection {
    
    Map<String, Member> members = new HashMap<String, Member>(); 
    List<String> emailList = new ArrayList<String>();
    
    public int enrollmentCount(){
        return members.size();
    }

    public boolean enroll(String identifier, String email) {
        if("".equals(identifier) && "".equals(email) || "".equals(email)){
            return false;
        }
        
        if("".equals(identifier)){
            if( emailList.contains(email)) {
                return false;
            }
            
            for( Member mems : members.values()){
                if(mems.getEmail().equals(email))
                    return false;
            }
            
            emailList.add(email);
            return true;
        }
        
        if(members.get(identifier) == null){

            if(emailList.contains(email)){
                emailList.remove(email);
            }
            
            members.put(identifier, new Member(identifier, email));
            return true;
        }
        return false;
    }

    public Member getMember(String identifier) {
        return members.get(identifier);
    }

    public int getEmailCount() {
        return emailList.size();
    }

    public boolean isEmailRecorded(String email) {
        return emailList.contains(email);
    }

    public void addMemberFlightMiles(String identifier, int miles) {
        // TODO Auto-generated method stub
        
    }

    public String getStatusFor(String identifier) {
        // TODO Auto-generated method stub
        return "";
    }

    public int getMilesFor(String identifier) {
        // TODO Auto-generated method stub
        return 0;
    }
}
