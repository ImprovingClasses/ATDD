package memberships;

import java.util.regex.Pattern;

import com.tddair.UserDao;

public class NewMembershipTest {
	
	private static final String emailAddressRegex = "[0-9A-Za-z]+@[0-9A-Za-z]+.[0-9A-Za-z]+";
	private static final Pattern emailAddressPattern = Pattern.compile(emailAddressRegex);
	private static final String userIdRegex = "[0-9A-Za-z]+";
	private static final Pattern userIdPattern = Pattern.compile(userIdRegex);
	
	private static final UserDao userDao = new UserDao();
	
	public static boolean isEmailAddressValid(String emailAddress) {
		return emailAddressPattern.matcher(emailAddress.toLowerCase()).find();
	}
	
	public static boolean isUserIdValid(String userId) {
		return userIdPattern.matcher(userId.toLowerCase()).find();
	}	
	
	public static boolean isEmailAddressUnique(String emailAddress) {
		return userDao.doesEmailAddressExist(emailAddress) == false;
	}
	
	public static boolean isUserIdUnique(String userId) {
		return userDao.doesUserIdExist(userId) == false;
	}
}