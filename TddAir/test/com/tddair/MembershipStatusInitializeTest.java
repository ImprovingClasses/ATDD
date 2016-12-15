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
    
    @Test
    public void when24999MilesAddedStatusIsRedAndMilesMatch() {
        mem.addMemberFlightMiles(identifier, 24999);
        assertTrue("Red".equalsIgnoreCase(mem.getStatusFor(identifier)));
        assertEquals(24999, mem.getMilesFor(identifier));
    }
    
    @Test
    public void when25000MilesAddedStatusIsGreenAndMilesMatch(){
        mem.addMemberFlightMiles(identifier, 25000);
        assertTrue("Green".equalsIgnoreCase(mem.getStatusFor(identifier)));
        assertEquals(25000, mem.getMilesFor(identifier));
    }
    
    @Test
    public void when50000MilesAddedStatusIsGreenAndMilesMatch(){
        mem.addMemberFlightMiles(identifier, 50000);
        assertTrue("Blue".equalsIgnoreCase(mem.getStatusFor(identifier)));
        assertEquals(50000, mem.getMilesFor(identifier));
    }
    
    @Test
    public void given24999when0MilesAddedStatusIsRedAndMilesMatch() {
        mem.addMemberFlightMiles(identifier, 24999);
        assertTrue("Red".equalsIgnoreCase(mem.getStatusFor(identifier)));
        mem.addMemberFlightMiles(identifier, 0);
        assertTrue("Red".equalsIgnoreCase(mem.getStatusFor(identifier)));
        assertEquals(24999, mem.getMilesFor(identifier));
    }

    @Test
    public void given24999when1MilesAddedStatusIsRedAndMilesMatch() {
        mem.addMemberFlightMiles(identifier, 24999);
        assertTrue("Red".equalsIgnoreCase(mem.getStatusFor(identifier)));
        mem.addMemberFlightMiles(identifier, 1);
        assertTrue("Green".equalsIgnoreCase(mem.getStatusFor(identifier)));
        assertEquals(25000, mem.getMilesFor(identifier));
    }
    
}
