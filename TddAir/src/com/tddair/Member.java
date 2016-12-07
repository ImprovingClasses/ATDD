package com.tddair;

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
		updateStatus();
	}
	
	public int getMileage_() {
		return mileage_;
	}
	
	public String getStatus(){
		return status_;
	}

	  public String calculateEarnedLevel()
	  {
		String level = "";
		//For mileage 0 to 24,999 return Red status
		if(mileage_ <= 24999)
		{
			System.out.println("Returning Red Level Status");
			return RED_;
		}
		else if(mileage_ <= 49999)
		{
			System.out.println("Returning Green Level Status");
			return GREEN_;
		}
		else if(mileage_ <= 74999)
		{
			System.out.println("Returning Blue Level Status");
			return BLUE_;
		}
		else 
		{
			System.out.println("Returning Golden Level Status");
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
		
		
		//Set status to earned status
		status_ = earnedStatus;
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
