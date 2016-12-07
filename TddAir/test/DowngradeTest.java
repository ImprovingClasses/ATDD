import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tddair.Member;

public class DowngradeTest {
	@Test public void currentMileage()
	{
		Member testObj = new Member("user", "email");
		testObj.addMiles(10000);
		assertEquals(testObj.getMileage(), 10000);
		assertEquals(testObj.getCurrentMileage(), 10000);
	}
	
	@Test public void resetMileage()
	{
		Member testObj = new Member("user", "email");
		testObj.addMiles(10000);
		testObj.yearOver();
		assertEquals(testObj.getMileage(), 10000);
		assertEquals(testObj.getCurrentMileage(), 0);
	}
	
	@Test public void downgradeStatus()
	{
		Member testObj = new Member("user", "email");
		testObj.addMiles(80000);
		assertEquals(testObj.getStatus(), "Gold");
		testObj.yearOver();
		testObj.yearOver();
		assertEquals(testObj.getStatus(), "Blue");
	}
	
	@Test public void keepHigherStatus()
	{
		Member testObj = new Member("user", "email");
		testObj.addMiles(30000);
		assertEquals(testObj.getStatus(), "Green");
		testObj.yearOver();
		testObj.addMiles(5000);
		assertEquals(testObj.getStatus(), "Green");
	}
}
