package com.tddair;

public class BlueStatus extends Status {

	@Override
	public int getRate() {
		return 8000;
	}

	@Override
	public String getLevel() {
		return "Blue";
	}

	@Override
	public int compareTo(Status o) {
		if (o instanceof GoldStatus)
			return -1;
		if (o instanceof BlueStatus)
			return 0;
		return 1;
	}

}
