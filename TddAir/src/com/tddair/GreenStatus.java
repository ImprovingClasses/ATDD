package com.tddair;

public class GreenStatus extends Status {

	@Override
	public int getRate() {
		return 9000;
	}

	@Override
	public String getLevel() {
		return "Green";
	}

	@Override
	public int compareTo(Status o) {
		if (o instanceof RedStatus)
			return 1;
		if (o instanceof GreenStatus)
			return 0;
		return -1;
	}

}
