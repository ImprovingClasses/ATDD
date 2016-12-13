package com.tddair;

import static org.junit.Assert.*;
import org.junit.Test;

public class RegisterMembershipTest {

    @Test
    public void initialMemberCountShouldBeZero() {
        MembershipManagmentCollection subject = new MembershipManagmentCollection();
        
        assertEquals(0, subject.enrollmentCount());
    }

}
