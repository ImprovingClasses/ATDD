package com.tddair;

public class Member {
    
    private String identifier;
    private String email;
    private int miles;
    private int yearlyMiles;
    private String status;
    
    public Member(String identifier, String email) {
        this.identifier = identifier;
        this.email = email;
        this.miles = 0;
        this.yearlyMiles = 0;
        this.status = "Red";
    }

    public Member(String identifier, String email, String status) {
        this.identifier = identifier;
        this.email = email;
        this.miles = 0;
        this.yearlyMiles = 0;
        this.status = status;
    }

    public String getIdentifier(){
        return identifier;
    }
    
    public String getEmail(){
        return email;
    }

    public void addFlightMiles(int miles) {
        this.miles += miles;
        this.yearlyMiles +=miles;

        if(yearlyMiles >= 75000)
            status = "Gold";
        else if(yearlyMiles >= 50000 && !"Gold".equalsIgnoreCase(status))
            status =  "Blue";
        else if(yearlyMiles >= 25000&& 
               !("Gold".equalsIgnoreCase(status) || "Blue".equalsIgnoreCase(status) ))
            status = "Green";
        else if (!("Gold".equalsIgnoreCase(status) 
                   || "Blue".equalsIgnoreCase(status) 
                   || "Green".equalsIgnoreCase(status) )
                )
            status =  "Red";
        
    }

    public int getMiles() {
        return miles;
    }

    public String getStatus() {
        
        return status;
        
    }
    

    public void yearPasses() {

        if(yearlyMiles >= 75000)
            status = "Gold";
        else if(yearlyMiles >= 50000 )
            status =  "Blue";
        else if(yearlyMiles >= 25000) {
            if("Gold".equalsIgnoreCase(status)){
                status = "Blue";
            }
            else 
                status = "Green";
        }
        else {
            if("Gold".equalsIgnoreCase(status)){
                status = "Blue";
            }
            else if("Blue".equalsIgnoreCase(status)){
                status = "Green";
            }
            else {
                status = "Red";
            }
        }
        yearlyMiles = 0;
        
        
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
