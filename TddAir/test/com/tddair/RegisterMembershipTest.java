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

    @Test
    public void givenOneMemberIsEnrolledwhenMemberIsRetrievedThenMemberAttributesShouldMatch(){
        subject.enroll("bob", "bob@abc.com");
        Member bob = subject.getMember("bob");
        assertEquals("bob", bob.getIdentifier());
        assertEquals("bob@abc.com", bob.getEmail());
    }
    
    @Test
    public void givenTwoMembersAreEnrolledWhenEachIsRetrieveThenMemberAttributesShouldMatch(){
        subject.enroll("bob", "bob@abc.com");
        subject.enroll("sue", "sue@abc.com");
        
        Member bob = subject.getMember("bob");
        assertEquals("bob", bob.getIdentifier());
        assertEquals("bob@abc.com", bob.getEmail());
        
        Member sue = subject.getMember("sue");
        assertEquals("sue", sue.getIdentifier());
        assertEquals("sue@abc.com", sue.getEmail());
    }

    @Test
    public void givenAnExistingMemberWhenMemberWithMatchingIdIsEnrolledThenTheyAreNotRecorded() {
        subject.enroll("bob", "bob@abc.com");
        boolean result = subject.enroll("bob", "sue@abc.com");
        
        assertFalse(result);
    }
    
    @Test
    public void givenAnExistingMemberWhenMemberWithMatchingIdIsEnrolledThenExistingMemberNotChanged() {
        subject.enroll("bob", "bob@abc.com");
        boolean result = subject.enroll("bob", "sue@abc.com");
        
        Member bob = subject.getMember("bob");
        assertEquals("bob", bob.getIdentifier());
        assertEquals("bob@abc.com", bob.getEmail());
        
    }
    
    @Test
    public void initialEmailOnlyMemberCountShouldBeZero() {
        assertEquals(0, subject.getEmailCount());
    }
    
    @Test
    public void whenOneEmailOnlyMemberEnteredThenEmailOnlyCountShouldBeOne(){
        subject.enroll("", "bob@abc.com");
        
        assertEquals(1,subject.getEmailCount());
    }
    
    @Test
    public void whenUserIdentifierAndEmailAreEmptyThenNoMemberIsAddedAndNoEmailIsRecorded(){
        assertFalse(subject.enroll("", ""));
    }
    
    
    @Test
    public void whenEmailOnlyMemberEnteredThenEmailInformationShouldBeRecoreded(){
        subject.enroll("", "bob@abc.com");
        assertTrue(subject.isEmailRecorded("bob@abc.com"));
    }
    
    @Test
    public void givenEmailOnlyMemberEnteredWhenIdenticalEmailOnlyMemberEnteredEmailShouldNotBeRecorded(){
        subject.enroll("", "bob@abc.com");
        assertFalse(subject.enroll("", "bob@abc.com"));
    }
 
    @Test
    public void givenExistingMemberWithIdentifierAndEmailWhenEmailOnlyMemberEnteredCountOfMembersWithIdentiferShouldStayTheSame(){
        subject.enroll("bob", "bob@abc.com");
        int size = subject.enrollmentCount();
        subject.enroll("", "bob@abc.com");
        assertEquals(size, subject.enrollmentCount() );
    }
    
    @Test
    public void givenExistingMemberWithEmailOnlyWhenMemberWithIdentifierAndEmailEnteredCountOfMembersWithOnlyEmailShouldStayTheSame() {
        subject.enroll("", "bob@abc.com");
        int size = subject.getEmailCount();
        subject.enroll("bob", "bob@abc.com");
        assertEquals(size, subject.enrollmentCount() );
    }

    @Test
    public void givenMemberEnrolledWithIdentifierAndEmailWhenEmailOnlyMemberWithIdenticalEmailEnteredEmailShouldNotBeRecorded(){
        subject.enroll("bob", "bob@abc.com");
        assertFalse(subject.enroll("", "bob@abc.com"));
    }





}
