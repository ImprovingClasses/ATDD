package com.tddair;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestBuyUpgrades {

@Test 
public void buySomeUpgradesOnMilesToBlueStatus(){
	Membership members =  new Membership();
	members.addNewMember("john", "john@abc.com",10000,"Blue",60000);
    members.buyUpgrades("john",2);
    members.
    assertEquals("Test successful NewYear miles reset", 44000, members.getById("john").getTotalMiles());	  
	assertEquals("Test successful NewYear miles reset", "Blue",members.getById("john").getStatus());	  
}

}
