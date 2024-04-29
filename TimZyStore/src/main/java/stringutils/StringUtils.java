package stringutils;

public class StringUtils {
	//qwery to get the login information 
	public static final String LOGIN_QUERY = "SELECT * FROM User where username = ? "; 
	public static final String ADD_NEW_USER = "INSERT INTO User (user_name, password, full_name, email,phone_number, profile_picture) "
		        + "VALUES (?,?,?,?,?,?)";
}
