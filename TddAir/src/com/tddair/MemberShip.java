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
			memberDao.getMemberByUserId(userId).addMiles(flight.getMileage());
		}
	}
	
	public void cleanUp() {
		memberDao.cleanUp();
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
	
	public void addMileage(String userId, int mileage) {
		Member member = memberDao.getMemberByUserId(userId);
		member.addMiles(mileage);
	}
	
	public int getMemberMileage(String userId) {
		return memberDao.getMemberByUserId(userId).getMiles();
	}
	
	public String getMemberStatus(String userId)
	{
		String status = "";
		Member member = memberDao.getMemberByUserId(userId);
		if (0 <= member.getMiles() && member.getMiles() < 25000)
		{
			status = "Red";
		}
		else if (25000 <= member.getMiles() && member.getMiles() < 50000)
		{
			status = "Green";
		}
		else if (50000 <= member.getMiles() && member.getMiles() < 75000)
		{
			status = "Blue";
		}
		else 
		{
			status = "Golden";
		}
		return status;
	}
	
	public String addNewMember(Member member) {
		if(MemberShipUtility.isValidMember(member)) {
			if(MemberShipUtility.isUniqueMember(member)) {
				System.out.println("WARNING: Overwriting User with ID '" + member.getUserId() + "'");
			}
			memberDao.addMember(member);
			return MemberShipUtility.REGISTERED;
		}
		return MemberShipUtility.NOT_REGISTERED;
	}
}
