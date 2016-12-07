package com.tddair;


import java.util.ArrayList;
public class Member {
	

	private static String RED_ = "Red";
	private static String GREEN_ = "Green";
	private static String BLUE_ = "Blue";
	private static String GOLDEN_ = "Golden";
	
	public Member(String username, String email)  {
		username_ = username;
		email_ = email;
		mileage_ = 0;
		status_ = RED_;
		points_ = 0;
	}
	
	public Member(String username, String email, String status, int points)  {
		username_ = username;
		email_ = email;
		mileage_ = 0;
		status_ = status;
		points_ = points;
	}

	
	public String getUsername_() {
		return username_;
	}

	public void setUsername_(String username_) {
		this.username_ = username_;
	}

	public String getEmail_() {
		return email_;
	}

	public void setEmail_(String email_) {
		this.email_ = email_;
	}
	
	public void addMileage(int newMileage)
	{
		mileage_ = mileage_ + newMileage;
		points_ = points_ + newMileage;
		updateStatus();
	}
	
	public int getMileage_() {
		return mileage_;
	}
	
	public int getPoints() {
		return points_;
	}
	
	public String getStatus(){
		return status_;
	}

	public void downgradeStatus()
	{
		System.out.println("Downgrading status " + status_);
		String downgradedStatus = "";
		ArrayList<String> statusList = new ArrayList<String>();
		statusList.add(RED_);
		statusList.add(GREEN_);
		statusList.add(BLUE_);
		statusList.add(GOLDEN_);
		/*
		 * Downgrade current status by one level
		 */
		//Search the statusList for our current status
		//  get the index
		//  if >0, subtract index by 1
		//  set status_ to value at new index
		int index = statusList.indexOf(status_);
		if(index > 0 )
		{
			index--;
		}
		downgradedStatus = statusList.get(index);
		
		//Set status to downgraded status
		status_ = downgradedStatus;
		System.out.println("downgraded status to " + status_);
		//Compare new downgraded status against the year earned status
		updateStatus();
		System.out.println("After updateStatus " + status_);
		
		//Reset miles to 0 
	    mileage_ = 0;
	}
	
	  public String calculateEarnedLevel()
	  {
		String level = "";
		//For mileage 0 to 24,999 return Red status
		if(mileage_ <= 24999)
		{
			System.out.println("Returning Red Level Earned YTD Status");
			return RED_;
		}
		else if(mileage_ <= 49999)
		{
			System.out.println("Returning Green Level Earned YTD Status");
			return GREEN_;
		}
		else if(mileage_ <= 74999)
		{
			System.out.println("Returning Blue Level Earned YTD Status");
			return BLUE_;
		}
		else 
		{
			System.out.println("Returning Golden Level Earned YTD Status");
			return GOLDEN_;
		}	
	  }
	  
	//Get the current status 
	private void updateStatus(){
		//Get current status
		String currentStatus = status_;
		
		//Check "earned" status 
		String earnedStatus = calculateEarnedLevel();
		//Check to see if "earned status is better than current status,
		//  If so update status
		//IF current status = earned status, do nothing.
		if(earnedStatus.equals(currentStatus))
		{
			return;
		}
		else if(earnedStatus.equals(RED_))
		{
			//do nothing because Red is the lowest and current status is that or better
			return;
		}
		else if(earnedStatus.equals(GREEN_)){
			if (currentStatus.equals(BLUE_) || currentStatus.equals(GOLDEN_))
			{
				//no change
				return;
			}
			else
			{
				//Current status is either green or red...safe to change 
				//  status to earned status
				status_ = earnedStatus;
				return;
			}
		}
		else if (earnedStatus.equals(BLUE_)){
			if(currentStatus.equals(GOLDEN_))
			{
				//do nothing
				return;
			}
			else
			{
				//Current status is either blue, green or red...safe to change 
				//  status to earned status
				status_ = earnedStatus;
				return;
			}
		}
		else
		{
			//earned status is golden, set earned status to status_
			//Set status to earned status
			status_ = earnedStatus;
		}
		//else do nothing

	}
	
	private void setStatus(String status) {
		System.out.println("Updating status for member " + username_ +
				" to" + status);
		status_ = status;
	}
	
	

	private String username_ = "";
	private String email_ = "";
	private int mileage_ = 0;
	private int points_ = 0;
	private String status_ = "";
}
