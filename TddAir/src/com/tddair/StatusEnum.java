package com.tddair;

public enum StatusEnum {

	Red, Green, Blue, Gold;

	@Override
	public String toString() {
		switch (this) {
		case Red:
			return "Red";
		case Green:
			return "Green";
		case Blue:
			return "Blue";
		case Gold:
			return "Gold";
		default:
			throw new IllegalArgumentException();
		}
	}
}
