import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tddair.Membership;

public class UpgradeTest {
	@Test public void buyUpgradeRed()
	{
		Membership testObj = new Membership("user", "email");
		testObj.addMiles(10000);
		testObj.buyUpgrades(1);
		assertEquals(testObj.getUpgrades(), 1);
		assertEquals(testObj.getMileage(), 0);
	}
	
	@Test public void buyUpgradeGreen()
	{
		Membership testObj = new Membership("user", "email");
		testObj.addMiles(25000);
		testObj.buyUpgrades(1);
		assertEquals(testObj.getUpgrades(), 1);
		assertEquals(testObj.getMileage(), 16000);
	}
	
	@Test public void buyUpgradeBlue()
	{
		Membership testObj = new Membership("user", "email");
		testObj.addMiles(50000);
		testObj.buyUpgrades(1);
		assertEquals(testObj.getUpgrades(), 1);
		assertEquals(testObj.getMileage(), 42000);
	}
	
	@Test public void buyUpgradeGold()
	{
		Membership testObj = new Membership("user", "email");
		testObj.addMiles(75000);
		testObj.buyUpgrades(1);
		assertEquals(testObj.getUpgrades(), 1);
		assertEquals(testObj.getMileage(), 68000);
	}
	
	@Test public void buyMultipleUpgrades()
	{
		Membership testObj = new Membership("user", "email");
		testObj.addMiles(75000);
		testObj.buyUpgrades(3);
		assertEquals(testObj.getUpgrades(), 3);
		assertEquals(testObj.getMileage(), 54000);
	}
	
	@Test public void insufficientMiles()
	{
		Membership testObj = new Membership("user", "email");
		testObj.addMiles(75000);
		testObj.buyUpgrades(11);
		assertEquals(testObj.getUpgrades(), 10);
		assertEquals(testObj.getMileage(), 5000);
	}

}
