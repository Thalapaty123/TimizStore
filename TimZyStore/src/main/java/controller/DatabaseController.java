package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseController {
//method to get connection to the database
	public Connection getConnection() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.cj.jbdc.Driver");
		String url = "jbdc:mysql://localhost3306/timzystore";
		String user = "root";
		String password = "";
		return DriverManager.getConnection(url, user, password);
	}
//user login method 
	public int getUserLoginInformation(String username, String password){
		try(connection con = getConnection()){
			PreparedStatement statement = con.prepareStatement(utils.Get_Login_User_Information);
			statement.setString(1, username);
			ResultSet result = statement.executeQuery();
			if (result.next()) {
				String hashedPasswordFromDb = result.getString("password");
				System.out.println("Hashed Password" + hashedPasswordFromDb);
				if (BCrypt.checkpw(password, hashedPasswordFromDb)) {
					String userAccountType = result.getString("accountType");
					if ("User".equals(userAccountType)) {
						return 1;
					} else if ("Admin".equals(userAccountType)) {
						return 5;
					}
				}
			}
			return 0; // Username or password is incorrect
		}
		catch(ClassNotFoundException | SQLException ex){
			ex.printStackTrace();
		}
	}

}
