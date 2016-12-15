package com.tddair;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PurchaseSeatUpgradeTest {

    MembershipManagementCollection mem = new MembershipManagementCollection();
    
    String identifier = "bob";
    String email = "bob@abc.com";
    
    @Before
    public void before(){
        mem.enroll(identifier, email);
    }
    
    @Test
    public void initialMemberHasNoUpgrades() {
        assertEquals(0, mem.getMemberUpgrades(identifier));
    }

    @Test
    public void notEnoughToPurchaseOneWhenRed(){
        mem.memberPurchaseUpgrades(identifier, 1);
        assertEquals(0, mem.getMemberUpgrades(identifier));
    }
    
    @Test
    public void purchaseOneUpgradeAsRed(){
        mem.addMemberFlightMiles(identifier, 10000);
        mem.memberPurchaseUpgrades(identifier, 1);
        assertEquals(1, mem.getMemberUpgrades(identifier));
    }
    
    @Test
    public void purchaseOneUpgradeAsGreen(){
        mem.addMemberFlightMiles(identifier, 9000);
        mem.setMemberStatus(identifier, "Green");
        mem.memberPurchaseUpgrades(identifier, 1);
        assertEquals(1, mem.getMemberUpgrades(identifier));
    }
    
    @Test
    public void purchaseOneUpgradeAsBlue(){
        mem.addMemberFlightMiles(identifier, 8000);
        mem.setMemberStatus(identifier, "Blue");
        mem.memberPurchaseUpgrades(identifier, 1);
        assertEquals(1, mem.getMemberUpgrades(identifier));     
    }
    
    @Test
    public void purchaseOneUpgradeAsGold(){
        mem.addMemberFlightMiles(identifier, 7000);
        mem.setMemberStatus(identifier, "Gold");
        mem.memberPurchaseUpgrades(identifier, 1);
        assertEquals(1, mem.getMemberUpgrades(identifier));     
    }
    
    @Test
    public void purchaseTwoUpgradesAsGold(){
        mem.addMemberFlightMiles(identifier, 14000);
        mem.setMemberStatus(identifier, "Gold");
        mem.memberPurchaseUpgrades(identifier, 2);
        assertEquals(2, mem.getMemberUpgrades(identifier));     
    }
    

    @Test
    public void tryPurchaseTwoUpgradesAsGoldButGetOne(){
        mem.addMemberFlightMiles(identifier, 7000);
        mem.setMemberStatus(identifier, "Gold");
        mem.memberPurchaseUpgrades(identifier, 2);
        assertEquals(1, mem.getMemberUpgrades(identifier));     
    }
    
   
}
