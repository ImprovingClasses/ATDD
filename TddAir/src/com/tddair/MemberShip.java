package com.tddair;

public class MemberShip 
{
	private MemberDao memberDao;
	
	public MemberShip() {
		memberDao = MemberDao.getInstance();
	}
	
	public void cleanUp()
	{
		memberDao.cleanUp();
	}
	
	public int getEnrollmentCount() {
		return memberDao.memberShipCount();
	}

	public String addNewMember(String userId, String emailAddress) {
		return addNewMember(new Member(userId, emailAddress));
	}
	
	public String addNewMember(String userId, String emailAddress, int initialMiles)
	{
		return addNewMember(new Member(userId, emailAddress, initialMiles));
	}
	
	public String getMemberStatus(String userId)
	{
		String status = "";
		Member member = memberDao.getMemberByUserId(userId);
		if (0 < member.getMiles() && member.getMiles() < 25000)
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
		if (MemberShipUtility.isValidMember(member) && 
			MemberShipUtility.isUniqueMember(member)) {
			memberDao.addMember(member);
			return MemberShipUtility.REGISTERED;
		}
		return MemberShipUtility.NOT_REGISTERED;
	}
}
