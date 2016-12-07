import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tddair.Membership;

public class DowngradeTest {
	@Test public void currentMileage()
	{
		Membership testObj = new Membership("user", "email");
		testObj.addMiles(10000);
		assertEquals(testObj.getMileage(), 10000);
		assertEquals(testObj.getCurrentMileage(), 10000);
	}
	
	@Test public void resetMileage()
	{
		Membership testObj = new Membership("user", "email");
		testObj.addMiles(10000);
		testObj.yearOver();
		assertEquals(testObj.getMileage(), 10000);
		assertEquals(testObj.getCurrentMileage(), 0);
	}
	
	@Test public void downgradeStatus()
	{
		Membership testObj = new Membership("user", "email");
		testObj.addMiles(80000);
		assertEquals(testObj.getStatus().getLevel(), "Gold");
		testObj.yearOver();
		testObj.yearOver();
		assertEquals(testObj.getStatus().getLevel(), "Blue");
	}
	
	@Test public void keepHigherStatus()
	{
		Membership testObj = new Membership("user", "email");
		testObj.addMiles(30000);
		assertEquals(testObj.getStatus().getLevel(), "Green");
		testObj.yearOver();
		testObj.addMiles(5000);
		assertEquals(testObj.getStatus().getLevel(), "Green");
	}
}
