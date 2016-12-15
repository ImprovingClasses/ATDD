package com.tddair;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MembershipStatusMilesTest {

    MembershipManagementCollection mem = new MembershipManagementCollection();
    
    private String identifier = "bob";
    private String email = "bob@abc.com";
    
    private int addMiles = 0;
    private int finalMiles = 0;
    private String status = "";
    
    @Before
    public void before(){
        mem.enroll(identifier, email);
    }

    @Parameters 
    public static Collection<Object[]> data() { 
      return Arrays.asList(new Object[][] { 
         { 24999, "Red", 24999 }, 
         { 25000, "Green", 25000 }, 
         { 50000, "Blue", 50000 },  
      }); 
    } 

    public MembershipStatusMilesTest(int addMiles, String status, int finalMiles){
        this.addMiles = addMiles;
        this.finalMiles = finalMiles;
        this.status = status;
    }
    
    @Test
    public void whenMilesAddedStatusIsRedAndMilesMatch() {
        mem.addMemberFlightMiles(identifier, addMiles);
        assertTrue(status.equalsIgnoreCase(mem.getStatusFor(identifier)));
        assertEquals(finalMiles, mem.getMilesFor(identifier));
    }
    

}
