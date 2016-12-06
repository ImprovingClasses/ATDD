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
	
	public String addNewMember(Member member) {
		if (MemberShipUtility.isValidMember(member) && 
			MemberShipUtility.isUniqueMember(member)) {
			memberDao.addMember(member);
			return MemberShipUtility.REGISTERED;
		}
		return MemberShipUtility.NOT_REGISTERED;
	}
}
