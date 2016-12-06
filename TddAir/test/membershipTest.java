import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.*;
import com.tddair.Member;
import com.tddair.Membership;



public class membershipTest {
	
	@Before
	public void setup() throws Exception{
		
	}
	
	@Test
	public void whenNoMembershipCountIsZero(){
		Assert.assertEquals( 0, new Membership().enrollmentCount() );
	}
	
	@Test
	public void whenMembershipCountIsOne(){
		Membership mbr = new Membership();
		mbr.addMember( "Bob", "bob@abc.com" );
		Assert.assertEquals( 1, mbr.enrollmentCount() );
	}
		
	@Test
	public void whenMemberMatched(){
		Membership mbr = new Membership();
		mbr.addMember( "Bob", "bob@abc.com" );
		Member m = mbr.getmemberByUserId( "Bob" );
		Assert.assertNotNull( m );
	}
	
	@Test
	public void whenMemberAlreadyExistsWithTheGivenId(){
		Membership mbr = new Membership();
		mbr.addMember( "Bob", "bob@abc.com" );
		//mbr.addMember( "Bob", "bob@abc.com" );
		//Member m = mbr.getmemberByUserId("Bob");
		Assert.assertTrue(mbr.isMember("Bob"));
	}
	
	@Test
	public void initialEmailCountIsZero(){
		//Membership mbr = new Membership();
	}
	
}
