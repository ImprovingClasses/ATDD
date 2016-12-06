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

	public Member getmemberByUserId(String userId){
		return members.get(userId);
	}

	public void addTravelMiles(String userId, int miles){
	    if( members.get(userId) != null )
	    	members.get(userId).addTravelMiles( miles );
	}
	
	public String getRewardLevel( String userId ){
		String retVal = REWARD_GOLDEN;
		int miles = 0;
		
	    if( members.get(userId) != null )
	    {
	    	miles = members.get(userId).getMiles();
	    
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


	/*public Member getmemberByEmailId(String email){
		//return members.values()getClass().;
	}*/

}
