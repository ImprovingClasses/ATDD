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
    
    private int initialMiles = 0;
    private String initialStatus = "Red";
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
         { 0, "Red", 24999, "Red", 24999 }, 
         { 0, "Red", 25000, "Green", 25000 }, 
         { 0, "Red", 50000, "Blue", 50000 }, 
         { 0, "Red", 75000, "Gold", 75000 }, 
         
      }); 
    } 

    public MembershipStatusMilesTest(int initialMiles, String initialStatus, int addMiles, String status, int finalMiles){
        this.initialMiles = initialMiles;
        this.initialStatus = initialStatus;
        this.addMiles = addMiles;
        this.finalMiles = finalMiles;
        this.status = status;
    }
    
    @Test
    public void whenMilesAddedStatusIsRedAndMilesMatch() {
        mem.addMemberFlightMiles(identifier, initialMiles);
        assertTrue(initialStatus.equalsIgnoreCase(mem.getStatusFor(identifier)));
        mem.addMemberFlightMiles(identifier, addMiles);
        assertTrue(status.equalsIgnoreCase(mem.getStatusFor(identifier)));
        assertEquals(finalMiles, mem.getMilesFor(identifier));
    }

}
