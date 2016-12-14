package com.tddair;

public class Member {
    
    private String identifier;
    private String email;
    
    public Member(String identifier, String email) {
        this.identifier = identifier;
        this.email = email;
    }

    public String getIdentifier(){
        return identifier;
    }
    
    public String getEmail(){
        return email;
    }

}
