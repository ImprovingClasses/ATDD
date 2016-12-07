package com.tddair;

public class RedStatus extends Status {

	private int rate = 10000;
	
	@Override
	public int getRate() {
		return rate;
	}

	@Override
	public String getLevel() {
		return "Red";
	}

	@Override
	public int compareTo(Status o) {
		if (o instanceof RedStatus)
			return 0;
		return -1;
	}

}
