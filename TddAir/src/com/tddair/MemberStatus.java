package com.tddair;

public enum MemberStatus {

	RED(0, "Red", 0, 24999, null),
	GREEN(1, "Green", 25000, 49999, MemberStatus.RED),
	BLUE(2, "Blue", 50000, 74999, MemberStatus.GREEN),
	GOLDEN(3, "Golden", 75000, Integer.MAX_VALUE, MemberStatus.BLUE);
	
	int loRange;
	int hiRange;
	int priority;
	String name;
	MemberStatus previous;
	
	MemberStatus(int prio, String n, int lo, int hi, MemberStatus prev) {
		priority = prio;
		loRange = lo;
		hiRange = hi;
		previous = prev;
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean inRange(int value) {
		return (loRange <= value) && (value <= hiRange);
	}
	
	public MemberStatus getDecrementedStatus() {
		return previous;
	}
	
	public int differenceFrom(MemberStatus status) {
		return priority - status.priority;
	}
	
	public static MemberStatus getStatusByName(String name) {
		if(MemberStatus.RED.getName().equalsIgnoreCase(name)) {
			return MemberStatus.RED;
		}
		if(MemberStatus.GREEN.getName().equalsIgnoreCase(name)) {
			return MemberStatus.GREEN;
		}
		if(MemberStatus.BLUE.getName().equalsIgnoreCase(name)) {
			return MemberStatus.BLUE;
		}
		if(MemberStatus.GOLDEN.getName().equalsIgnoreCase(name)) {
			return MemberStatus.GOLDEN;
		}
		return null;
	}
}
