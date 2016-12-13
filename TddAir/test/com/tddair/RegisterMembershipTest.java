package com.tddair;

import static org.junit.Assert.*;
import org.junit.Test;

public class RegisterMembershipTest {

    MembershipManagmentCollection subject = new MembershipManagmentCollection();
    
    @Test
    public void initialMemberCountShouldBeZero() {
        assertEquals(0, subject.enrollmentCount());
    }
    
    @Test
    public void whenOneMemberEnrolledCountShouldBeOne() {
        subject.enroll("bob", "bob@abc.com");
        assertEquals(1, subject.enrollmentCount());
    }


}
