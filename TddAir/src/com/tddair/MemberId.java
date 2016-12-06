package com.tddair;

public class MemberId {
	
	int hashCode = -1;
	
	public MemberId(String userId, String emailAddress) {
		this.hashCode = userId.hashCode() + emailAddress.hashCode();
	}

	@Override
	public int hashCode() {
		return this.hashCode;
	}
}
