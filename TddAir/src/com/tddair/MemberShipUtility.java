package com.tddair;

import java.util.regex.Pattern;

public class MemberShipUtility {
	
	private static final String emailAddressRegex = "[0-9A-Za-z]+@[0-9A-Za-z]+\\.[0-9A-Za-z]+";
	private static final Pattern emailAddressPattern = Pattern.compile(emailAddressRegex);
	private static final String userIdRegex = "[0-9A-Za-z]*";
	private static final Pattern userIdPattern = Pattern.compile(userIdRegex);
	
	public static final String REGISTERED = "registered";
	public static final String NOT_REGISTERED = "not registered";
	
	private static final MemberDao memberDao = MemberDao.getInstance();
	
	public static boolean isEmailAddressValid(String emailAddress) {
		return emailAddressPattern.matcher(emailAddress.toLowerCase()).matches();
	}
	
	public static boolean isUserIdValid(String userId) {
		return userIdPattern.matcher(userId.toLowerCase()).matches();
	}	
	
	public static boolean isEmailAddressUnique(String emailAddress) {
		return memberDao.doesEmailAddressExist(emailAddress) == false;
	}
	
	public static boolean isUserIdUnique(String userId) {
		return memberDao.doesUserIdExist(userId) == false;
	}
	
	public static boolean isValidMember(Member member)
	{
		boolean isUserIdValid = isUserIdValid(member.getUserId());
		boolean isEmailAddressValid = isEmailAddressValid(member.getEmailAddress());
		return isUserIdValid && isEmailAddressValid;
	}
	
	public static boolean isUniqueMember(Member member) {
		return !(memberDao.doesUserIdExist(member.getUserId()) && memberDao.doesEmailAddressExist(member.getEmailAddress()));
	}
}