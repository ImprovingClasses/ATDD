package com.tddair;

import java.util.HashMap;
import java.util.Map;

public class Membership {

	private Map<String, Member> members = new HashMap<String, Member>();
	
	public static String REWARD_RED = "RED";
	public static String REWARD_BLUE = "BLUE";
	public static String REWARD_GREEN = "GREEN";
	public static String REWARD_GOLDEN = "GOLDEN";
	

	public Membership(){

	}

	public Membership(String userId, String email, int initialMiles){
		members.put(userId, new Member(userId, email, initialMiles));
	}

	public int enrollmentCount(){
		return members.size();
	}

	public boolean addMember(String userId, String email, int initialMiles ){
		if( email == null || email.isEmpty() )
			return false;

		if(userId == null || userId.isEmpty())
			members.put(email,new Member(email, email, initialMiles));
		else
			members.put(userId, new Member(userId, email, initialMiles));
		return true;
	}
	
	public boolean addMember(String userId, String email, int initialMiles,
			int points, String initStatus ){
		if( email == null || email.isEmpty() )
			return false;

		if(userId == null || userId.isEmpty())
			members.put(email,new Member(email, email, initialMiles, points, initStatus));
		else
			members.put(userId, new Member(userId, email, initialMiles, points, initStatus));
		return true;
	}
	
	public void recalculateUserStatus( String userId ) {
		Member mbr = members.get(userId);
		System.out.println("Entering he bump status - " + mbr.getStatus());
		if(mbr.getStatus().equals("RED"))
			return;
		else if(mbr.getStatus().equals("GREEN"))
			mbr.setStatus("RED");
		else if(mbr.getStatus().equals("BLUE"))
			mbr.setStatus("GREEN");
		else if(mbr.getStatus().equals("GOLDEN"))
			mbr.setStatus("BLUE");
		System.out.println("Exiting he bump status - " + mbr.getStatus());
	}
	
	
	public Member getmemberByUserId(String userId){
		return members.get(userId);
	}

	public void addTravelMiles(String userId, int miles){
		Member mbr = members.get(userId);
	  if( mbr != null ){
		  mbr.addTravelMiles( miles );
		  String stat = this.getRewardLevel(userId);
		  mbr.setStatus(stat);
	  }
	    
	    
	}
	
	public String getRewardLevel( String userId ){
		String retVal = REWARD_GOLDEN;
		int miles = 0;
		
	    if( members.get(userId) != null )
	    {
	    	 
	    	miles = members.get(userId).getMiles();
	    	System.out.println( "getRewardLevel -- user " + userId + " has " + miles + " miles" );
	    
	    if( miles >= 0 && miles < 25000 )
	      retVal = REWARD_RED;
	    else if( miles >= 25000 && miles < 50000 )
	      retVal = REWARD_GREEN;
	    else if( miles >= 50000 && miles < 75000 )
		      retVal = REWARD_BLUE;
	    }
	    return retVal;
	}
	
	public boolean isMember(String userId){
		System.out.println( "Membership.isMember(); userID =" + userId);
		return members.containsKey(userId);
	}

	public int getMemberMiles(String userId){
		int retVal = 0;
		if( members.containsKey(userId) ){
           retVal = members.get(userId).getMiles();
		}
		return retVal;
	}
	
	public String getMemberStatus(String userId){
		String retVal = "RED";
		if( members.containsKey(userId) ){
           retVal = members.get(userId).getStatus();
		}
		return retVal;
	}
	/*public Member getmemberByEmailId(String email){
		//return members.values()getClass().;
	}*/

}
