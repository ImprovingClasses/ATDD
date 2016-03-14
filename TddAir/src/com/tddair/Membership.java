package com.tddair;

public class Membership {
	
	private int count = 0;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	

	public Member GetMemberById(String id) {
		Member member = new Member();
		member.setId(id);
		return member;
	}
	

}
