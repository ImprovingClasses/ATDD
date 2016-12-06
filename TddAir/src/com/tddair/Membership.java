package com.tddair;

import java.util.*;

public class Membership {
	
	//Map the number of miles to their color.
	private Map<ColorStatusEnum,Integer> myColorStatusToMilesMap = 
			new HashMap<>();
	
	private ArrayList<Member> myMembers;
	
	public Membership() {
		myMembers = new ArrayList<>();
		
		//Initialize mile status map. Were using the minimum
		//for each color.
		myColorStatusToMilesMap.put(ColorStatusEnum.RED,0);
		myColorStatusToMilesMap.put(ColorStatusEnum.GREEN,25000);
		myColorStatusToMilesMap.put(ColorStatusEnum.BLUE,50000);
		myColorStatusToMilesMap.put(ColorStatusEnum.GOLD,75000);
	}
	
	public int getMemebersCount() {
		return myMembers.size();
	}
	
	public boolean addMember(Member newMember){
		
		Boolean resultBool = true;
		
		//If1 user id or email is blank then do not add
		//this member.
		//Is this user id or email invalid?
		if(newMember.getUserId() == null || newMember.getUserId().isEmpty() ||
				newMember.getEmail() == null || newMember.getEmail().isEmpty()) {
			//Yes, the user id or email is invalid.
			resultBool = false;
		}
		else {
			//No, the user id and email are both valid.
			
			//Loop though all of our current Members to check
			//for a potential duplicate.
			for(Member member : myMembers){
				if(member.getUserId().equals(newMember.getUserId())) {
					resultBool = false;
				}
			}
			 
			//Are we okay to add this member?
			if(resultBool) {
				//Yes, its okay to add this member.
				
				//Update the member status
				for(ColorStatusEnum enumColor : myColorStatusToMilesMap.keySet()) {
					
					//Does the user have a greater amount
					//of miles than this color?
					if(myColorStatusToMilesMap.get(enumColor) <= newMember.getMiles()) {
						//Yes, the user has at least this number of miles.
						//Set its status to this color.
						newMember.setColorStatus(enumColor);
					}
					
				}
				//Add new member
				myMembers.add(newMember);
			}
		}
		
		
		return resultBool;
	}
	
	public Member getMemberById(String userId)throws Exception {
		for(Member member : myMembers){
			if (member.getUserId().equals(userId)){
				return member;
			}
		}
		throw new Exception("Member Id not Found");
	}
}
