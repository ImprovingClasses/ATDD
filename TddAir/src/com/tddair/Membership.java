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
  
  public String getEmail(String username){
	//  return "bob@abc.com";
	  String email = "";
	  Iterator <Member> it = members.iterator();
	  while(it.hasNext())
	  {
		  Member retrievedMember = it.next();
		  String retrievedUsername = retrievedMember.getUsername_();
		  if (retrievedUsername.equals(username))
		  {
			  email = retrievedMember.getEmail_();
			  System.out.println("Found email = " + email + " for user = " + username);
			  return email;
		  }
	  }
	  System.out.println("Did not find username = " + username);
	  return email;
  }
  
  private Vector<Member> members = new Vector<Member>();
  
}
