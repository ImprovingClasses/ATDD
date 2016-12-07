import static org.junit.Assert.*;

import org.junit.Test;

import com.tddair.Flight;
import com.tddair.Member;

public class FlightMilesTest {

	@Test public void bookGoodFlight()
	{
		Member memObj = new Member("user", "email");
		Flight flight = new Flight("AAA","BBB", 123, "TD", 123);
		memObj.bookFlight(flight);
		assertEquals(memObj.getMileage(), 123);
	}
	
	@Test public void bookBadFlight()
	{
		Member memObj = new Member("user", "email");
		Flight flight = new Flight("AAA","BBB", 123, "AA", 123);
		memObj.bookFlight(flight);	
		assertEquals(memObj.getMileage(), 0);
	}
}
