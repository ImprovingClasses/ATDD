import static org.junit.Assert.*;

import org.junit.Test;

import com.tddair.*;

public class MileageTest {
	
	@Test public void initialMileageIsZero() {
		Member memObj = new Member("userID", "email");
		assertEquals(memObj.getMileage(),0);
	}
	
	@Test public void addMileage() {
		Member memObj = new Member("userID", "email");
		memObj.addMiles(14999);
		assertEquals(memObj.getMileage(),14999);
	}
	
	@Test public void addTwoMileage() {
		Member memObj = new Member("userID", "email");
		memObj.addMiles(14999);
		memObj.addMiles(10000);
		assertEquals(memObj.getMileage(),24999);
	}
	
}
