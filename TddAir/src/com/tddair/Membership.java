package com.tddair;

import java.util.*;

public class Membership {
  public int enrollmentCount() {
	  return members.size();
  }
  
  public void enroll(String username, String email) {
	  Member newMember = new Member(username, email);
	  members.add(newMember);
  }
  
  private Vector<Member> members = new Vector<Member>();
  
}
