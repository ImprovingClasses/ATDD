package com.tddair;

import java.util.*;

public class Membership {
  public int enrollmentCount() {
	  return members.size();
  }
  
  public boolean enroll(String username, String email) {
	  Member newMember = new Member(username, email);
	  if (getEmail(username).equals(""))
	  {
		  members.add(newMember);
		  System.out.println("Username was not found, adding user " + username);
		  return true;
	  }
	  else
	  {
		  //User was found so do not re-add
		  System.out.println("Username was found for user " + username + ". Did not add.");

		  return false;
	  }
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
