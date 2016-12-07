package com.tddair;

public class MemberShip  {
	private MemberDao memberDao;
	private FlightDao currentFlights;
	
	public MemberShip(FlightDao flights) {
		memberDao = MemberDao.getInstance();
		currentFlights = flights;
	}
	
	public void userTakesFlight(String userId, String flightName) {
		Flight flight = currentFlights.getFlightBy(flightName);
		
		if(flight.getFlightNumber().toLowerCase().contains("td")) {
			memberDao.getMemberByUserId(userId).addMilesFlown(flight.getMileage());
		}
	}
	
	public void cleanUp() {
		memberDao.cleanUp();
	}
	
	public int makePurchases(String userId, int purchases) {
		Member member = memberDao.getMemberByUserId(userId);
		int currencyMiles = member.getCurrencyMiles();
		
		int successfuPurchases = currencyMiles / (member.getMemberStatus().getUpgradePrice());
		int remainingCurrency = currencyMiles % (member.getMemberStatus().getUpgradePrice());
		
		member.setCurrencyMiles(remainingCurrency);
		return successfuPurchases;
	}
	
	public int getEnrollmentCount() {
		return memberDao.memberShipCount();
	}

	public String addNewMember(String userId, String emailAddress) {
		return addNewMember(new Member(userId, emailAddress, 0));
	}
	
	public String addNewMember(String userId, String emailAddress, int initialMiles) {
		return addNewMember(new Member(userId, emailAddress, initialMiles));
	}
	
	public int getCurrencyMiles(String userId) {
		return memberDao.getMemberByUserId(userId).getCurrencyMiles();
	}
	
	public void addMileage(String userId, int mileage) {
		Member member = memberDao.getMemberByUserId(userId);
		member.addMilesFlown(mileage);
		member.setMemberStatus(calculateStatus(member));
	}
	
	public int getYearlyMemberMileage(String userId) {
		return memberDao.getMemberByUserId(userId).getYearlyMiles();
	}
	
	public MemberStatus getMemberStatus(String userId) {
		return memberDao.getMemberByUserId(userId).getMemberStatus();
	}
	
	public void setMemberShipStatus(String userId, String memberShipStatus)
	{
		Member member = memberDao.getMemberByUserId(userId);
		member.setMemberStatus(MemberStatus.getStatusByName(memberShipStatus));
	}
	
	public String addNewMember(Member member) {
		String registeredStatus = MemberShipUtility.NOT_REGISTERED;
		
		if(MemberShipUtility.isValidMember(member)) {
			if(MemberShipUtility.isUniqueMember(member)) {
				System.out.println("WARNING: Overwriting User with ID '" + member.getUserId() + "'");
			}
			memberDao.addMember(member);
			registeredStatus = MemberShipUtility.REGISTERED;
			member.setMemberStatus(calculateStatus(member));
		}
		return registeredStatus;
	}
	
	public void updateStatusAfterOneYear(String userId) {
		Member member = memberDao.getMemberByUserId(userId);
		member.setMemberStatus(calculateStatus(member));
		member.resetYearlyMiles();
	}
	
	private MemberStatus calculateStatus(Member member) {
		System.out.println("Member yearly miles is " + member.getYearlyMiles());
		int yearlyMiles = member.getYearlyMiles();
		MemberStatus currentStatus = member.getMemberStatus();
		
		MemberStatus newStatus = MemberStatus.GOLDEN;
		while(newStatus.previous != null && newStatus.inRange(yearlyMiles) == false) {
			newStatus= newStatus.previous;
		}
		
		int difference = currentStatus.differenceFrom(newStatus);
		if(difference > 1) {
			newStatus = currentStatus.previous;
		}
		
		return newStatus;
	}
}
