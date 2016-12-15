package com.tddair;

public class Member {
    
    private String identifier;
    private String email;
    private int miles;
    
    public Member(String identifier, String email) {
        this.identifier = identifier;
        this.email = email;
        this.miles = 0;
    }

    public String getIdentifier(){
        return identifier;
    }
    
    public String getEmail(){
        return email;
    }

    public void addFlightMiles(int miles) {
        this.miles += miles;
        
    }

    public int getMiles() {
        return miles;
    }

    public String getStatus() {
        if(miles >= 75000)
            return "Gold";
        if(miles >= 50000)
            return "Blue";
        if(miles >= 25000)
            return "Green";
        else
            return "Red";
    }

}
