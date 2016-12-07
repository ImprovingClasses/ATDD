import static org.junit.Assert.*;

import org.junit.Test;

import com.tddair.*;

public class MileageTest {
	
	@Test public void initialMileageIsZero() {
		Membership memObj = new Membership("userID", "email");
		assertEquals(memObj.getMileage(),0);
	}
	
	@Test public void addMileage() {
		Membership memObj = new Membership("userID", "email");
		memObj.addMiles(14999);
		assertEquals(memObj.getMileage(),14999);
	}
	
	@Test public void addTwoMileage() {
		Membership memObj = new Membership("userID", "email");
		memObj.addMiles(14999);
		memObj.addMiles(10000);
		assertEquals(memObj.getMileage(),24999);
	}
	
	@Test public void checkStatus() {
		Membership memObj = new Membership("userID", "email");
		assertEquals(memObj.getStatus().getLevel(),"Red");
	}
	
	@Test public void checkStatusGreen() {
		Membership memObj = new Membership("userID", "email");
		memObj.addMiles(25000);
		assertEquals(memObj.getStatus().getLevel(),"Green");
	}
	
	@Test public void checkStatusBlue() {
		Membership memObj = new Membership("userID", "email");
		memObj.addMiles(50000);
		assertEquals(memObj.getStatus().getLevel(),"Blue");
	}
	
	@Test public void checkStatusGold() {
		Membership memObj = new Membership("userID", "email");
		memObj.addMiles(75000);
		assertEquals(memObj.getStatus().getLevel(),"Gold");
	}
	
	
}
