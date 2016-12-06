package com.tddair;

import java.util.*;

public class Membership {
  public int enrollmentCount() {
	  return members.size();
  }
  
  public boolean enroll(String username, String email) {
	  
	  //If email is empty, do not register
	  if(email.isEmpty())
	  {
		  System.out.println("Email was found empty, returning false");
		  return false;
	  }
	  
	  //If username is empty and email is not, use email as the username
	  if(username.isEmpty())
	  {
		  System.out.println("Username was found empty with a valid email.  Adding with email as username");
		  //Check if a user exists with the username as email
		  if(!(doesUserExist(email)))
		  {  //Check if member already exists
			 Member newMember = new Member(email, email);
		     members.add(newMember);
		     return true;
		  }
		  //else, the user existed and no not add
		  return false;
	  }
	  	  
	  
	  //If you get here, username and email are not empty, check if username already exists
	  if (!(doesUserExist(username)))
	  {
		  Member newMember = new Member(username, email);
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
  
  private boolean doesUserExist(String username)
  {
	 
	  Iterator <Member> it = members.iterator();
	  while(it.hasNext())
	  {
		  Member retrievedMember = it.next();
		  String retrievedUsername = retrievedMember.getUsername_();
		  if (retrievedUsername.equals(username))
		  {
			  System.out.println("Membership:doesExist() ==> Found user");
			  return true;
		  }
	  }
	  System.out.println("Membership:doesExist() ==> Did not find username = " + username);
	  return false;
	  
  }
  
  private Vector<Member> members = new Vector<Member>();
  private Vector<String> emailOnlyMembers = new Vector<String>();
  
}
