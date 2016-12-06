package com.tddair;

public class MemberShip 
{
	private MemberDao memberDao;
	
	public MemberShip()
	{
		memberDao = MemberDao.getInstance();
	}
	
	public int getEnrollmentCount()
	{
		return memberDao.memberShipCount();
	}

	public void addNewMember(Member member) {
		if (MemberShipUtility.isValidMember(member) && 
			MemberShipUtility.isUniqueMember(member)) {
			memberDao.addMember(member);
		}
	}
	
}
