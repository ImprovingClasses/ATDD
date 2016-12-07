package com.tddair;

public abstract class Status implements Comparable<Status> {
	public abstract int getRate();
	public abstract String getLevel();
	public UpgradeTransaction buyUpgrades(int amount, int mileage)
	{
		int spent = 0;
		int rate = getRate();
		if (mileage >= amount * rate)
		{
			spent = amount * rate;
			return new UpgradeTransaction(amount, spent);
		} else
		{
			int sum = mileage / rate;
			spent = sum * rate;
			return new UpgradeTransaction(sum, spent);
		}
	}
}
