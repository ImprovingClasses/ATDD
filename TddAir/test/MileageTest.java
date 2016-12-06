import static org.junit.Assert.*;

import org.junit.Test;

import com.tddair.*;

public class MileageTest {
	
	@Test public void initialMileageIsZero() {
		Member memObj = new Member("userID", "email");
		assertEquals(memObj.getMileage(),0);
	}
}
