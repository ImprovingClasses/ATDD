package memberships;

import java.util.regex.Pattern;

import com.tddair.MemberDao;

public class NewMembershipTest {
	
	private static final String emailAddressRegex = "[0-9A-Za-z]+@[0-9A-Za-z]+.[0-9A-Za-z]+";
	private static final Pattern emailAddressPattern = Pattern.compile(emailAddressRegex);
	private static final String userIdRegex = "[0-9A-Za-z]+";
	private static final Pattern userIdPattern = Pattern.compile(userIdRegex);
	
	private static final MemberDao memberDao = new MemberDao();
	
	public static boolean isEmailAddressValid(String emailAddress) {
		return emailAddressPattern.matcher(emailAddress.toLowerCase()).find();
	}
	
	public static boolean isUserIdValid(String userId) {
		return userIdPattern.matcher(userId.toLowerCase()).find();
	}	
	
	public static boolean isEmailAddressUnique(String emailAddress) {
		return memberDao.doesEmailAddressExist(emailAddress) == false;
	}
	
	public static boolean isUserIdUnique(String userId) {
		return memberDao.doesUserIdExist(userId) == false;
	}
}