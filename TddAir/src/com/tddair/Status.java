package com.tddair;

public class Status {
	
	public Status() {}
	
	
	
	public StatusEnum getStatusForMiles(int miles) {
		StatusEnum status = StatusEnum.Red;
		
		if ( (miles >= 25000) && (miles < 50000) ) status = StatusEnum.Green; 
		else if ( (miles >= 50000) && (miles < 75000) ) status = StatusEnum.Blue;
		else if (miles >= 75000) status = StatusEnum.Gold;
		
		return status;
		
	}
	
	public StatusEnum checkStatusForChange(StatusEnum startingStatus, StatusEnum endOfYearStatus) {
		StatusEnum status = null;
		
		if (endOfYearStatus.ordinal() >= startingStatus.ordinal()) {
			status = endOfYearStatus;
		}
		
		else if (endOfYearStatus.ordinal() < startingStatus.ordinal()) {
			status = StatusEnum.values()[startingStatus.ordinal()-1];
		}
		
		return status;
	}
	
	
	public StatusEnum checkStatusForChange(int startingMiles, int endOfYearMiles) {
		StatusEnum startingStatus = getStatusForMiles(startingMiles);
		StatusEnum endingStatus = getStatusForMiles(endOfYearMiles);
		
		return checkStatusForChange(startingStatus, endingStatus);
		
	}
	

}
