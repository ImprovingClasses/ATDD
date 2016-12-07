package com.tddair;

import java.time.MonthDay;
import java.time.Year;
import java.util.HashMap;
import java.util.List;

import com.tddair.Membership.Status;

public class Member {
	
	private String userID;
	private String email;
	private int miles;
	private Status previousStatus;
	public Status getPreviousStatus() {
		return previousStatus;
	}

	public void setPreviousStatus(Status previousStatus) {
		this.previousStatus = previousStatus;
	}

	public Status getNextStatus() {
		return nextStatus;
	}

	public void setNextStatus(Status nextStatus) {
		this.nextStatus = nextStatus;
	}

	public int getCurrentMiles() {
		return currentMiles;
	}

	public void setCurrentMiles(int currentMiles) {
		this.currentMiles = currentMiles;
	}
	private Status nextStatus;
	private int currentMiles;
	
	public enum Status {						
		Red, 
		Green, 
		Blue, 
		Gold
	}
	
	
	public Member(String userID, String email, int miles)
	{
		this.userID = userID;
		this.email = email;
		this.miles = miles;
	}
	
	public Member(){
		
	}
	
	
	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	public Member(String email, String userID) {
		this.userID = userID;
		this.email = email;
	}
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void userFlightMiles(List<Flight> flights)
	{

				 for (Flight e:flights)
				 {
				 currentMiles += miles;
				 
				 //addMiles(miles);
				 
				 
				 
				 
				 }
				 
				 setNextYearStatus();
			 
		
	}
	
	public void addMiles(int miles){
					 
		         setCurrentMiles(miles);
				 setMiles(miles);
			 
			 

				
		}
		
	

public void setNextYearStatus() {
		int year = Year.now().getValue();
		int month = MonthDay.now().getMonthValue();
	
		membershipLevel();
			 
			 if (previousStatus == Status.Gold && currentMiles < 75000 )
			 {
				 nextStatus=  Status.Blue;
			 }
			 else if (previousStatus == Status.Gold && currentMiles >= 75000 )
			 {
				 nextStatus=   Status.Gold;
			 }
			 else if (previousStatus == Status.Blue && currentMiles < 50000 )
			 {
				 nextStatus=   Status.Green;
			 }
			 else if (previousStatus == Status.Blue && currentMiles >= 50000 )
			 {
				 nextStatus=   Status.Blue;
			 }
			 else if (previousStatus == Status.Green && currentMiles < 25000 )
			 {
				 nextStatus=   Status.Red;
			 }
			 else if (previousStatus == Status.Green && currentMiles >= 25000 )
			 {
				 nextStatus=   Status.Green;
			 }
			 else 
			 {
				 nextStatus=   Status.Red;
			 }
		 }
	


public Status membershipLevel()
{
	if (currentMiles <25000)
	{
		previousStatus = Status.Red;
	}
	else if (currentMiles >=25000 && currentMiles < 50000)
	{
		previousStatus = Status.Green;
	} 
	else if (currentMiles >=50000 && currentMiles < 75000)
	{
		previousStatus = Status.Blue;
	}
	else if (currentMiles >= 75000)
	{
		previousStatus = Status.Gold;
	}
	 return previousStatus;	
		
}

}



	
	
	


