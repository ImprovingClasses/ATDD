package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MembershipStatusExpiresTest {

    MembershipManagementCollection mem = new MembershipManagementCollection();
    
    String identifier = "bob";
    String email = "bob@abc.com";
    
    @Before
    public void before(){

    }
    
    @Test
    public void RedStatusExpiresToRed() {
        mem.enroll(identifier, email);
        mem.addMemberFlightMiles(identifier, 24000);
        mem.yearExpires();
        assertTrue("Red".equalsIgnoreCase(mem.getStatusFor(identifier)));
    }
    
    @Test
    public void GreenStatusExpiresToRed() {
        mem.enroll(identifier, email);
        mem.setMemberStatus(identifier, "Green");
        mem.yearExpires();
        assertTrue("Red".equalsIgnoreCase(mem.getStatusFor(identifier)));
    }
    
    @Test
    public void BlueStatusExpiresToGreen() {
        mem.enroll(identifier, email);
        mem.setMemberStatus(identifier, "Blue");
        mem.yearExpires();
        assertTrue("Green".equalsIgnoreCase(mem.getStatusFor(identifier)));
    }
    
    @Test
    public void GoldStatusExpiresToBlue() {
        mem.enroll(identifier, email);
        mem.setMemberStatus(identifier, "Gold");
        mem.yearExpires();
        assertTrue("Blue".equalsIgnoreCase(mem.getStatusFor(identifier)));
    }
    
    @Test
    public void GoldStatusExpiresToGold() {
        mem.enroll(identifier, email);
        mem.addMemberFlightMiles(identifier, 75000);
        mem.yearExpires();
        assertTrue("Gold".equalsIgnoreCase(mem.getStatusFor(identifier)));
    }

    @Test
    public void BlueStatusExpiresToBlue() {
        mem.enroll(identifier, email);
        mem.addMemberFlightMiles(identifier, 50000);
        mem.yearExpires();
        assertTrue("Blue".equalsIgnoreCase(mem.getStatusFor(identifier)));
    }
    
    @Test
    public void GreenStatusExpiresToGreen() {
        mem.enroll(identifier, email);
        mem.addMemberFlightMiles(identifier, 25000);
        mem.yearExpires();
        assertTrue("Green".equalsIgnoreCase(mem.getStatusFor(identifier)));
    }


    
}
