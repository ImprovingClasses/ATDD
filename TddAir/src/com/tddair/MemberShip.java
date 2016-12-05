package com.tddair;

import java.util.ArrayList;

public class MemberShip 
{
	private MemberDao members;
	
	public MemberShip()
	{
		members = new MemberDao();
	}
	
	public int getEnrollmentCount()
	{
		return members.memberShipCount();
	}

}
