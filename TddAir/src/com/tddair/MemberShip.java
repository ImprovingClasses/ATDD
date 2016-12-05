package com.tddair;

public class MemberShip 
{
	private MemberDao memberDao;
	
	public MemberShip()
	{
		memberDao = new MemberDao();
	}
	
	public int getEnrollmentCount()
	{
		return memberDao.memberShipCount();
	}

	public void addNewMember(Member member) {
		memberDao.addMember(member);
	}
}
