package com.tddair;

public class GoldStatus extends Status {

	@Override
	public int getRate() {
		return 7000;
	}

	@Override
	public String getLevel() {
		return "Gold";
	}

	@Override
	public int compareTo(Status arg0) {
		if (arg0 instanceof GoldStatus)
			return 0;
		return 1;
	}

}
