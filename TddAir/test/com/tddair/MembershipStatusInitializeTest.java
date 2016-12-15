package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MembershipStatusInitializeTest {

    MembershipManagementCollection mem = new MembershipManagementCollection();
    
    String identifier = "bob";
    String email = "bob@abc.com";
    
    @Before
    public void before(){
        mem.enroll(identifier, email);
    }
    
    @Test
    public void initialMemberStatusIsRed() {
        assertTrue("Red".equalsIgnoreCase(mem.getStatusFor(identifier)));
    }
    
    @Test
    public void initialMemberMilesIsZero() {
        assertEquals(0, mem.getMilesFor(identifier));
    }
    

    @Test
    public void whenMissingIdentifierAddingMiles() {
        mem.addMemberFlightMiles("joe", 24999);
        assertTrue("Red".equalsIgnoreCase(mem.getStatusFor(identifier)));
        assertEquals(0, mem.getMilesFor(identifier));
    }

    @Test
    public void whenMissingIdentifierGetStatus() {
        assertNull(mem.getStatusFor("Sue"));
        assertTrue("Red".equalsIgnoreCase(mem.getStatusFor(identifier)));
        assertEquals(0, mem.getMilesFor(identifier));
    }
    
    @Test
    public void whenMissingIdentifierGetMiles() {
        mem.getMilesFor("Sue");
        assertTrue("Red".equalsIgnoreCase(mem.getStatusFor(identifier)));
        assertEquals(0, mem.getMilesFor(identifier));
    }
}
