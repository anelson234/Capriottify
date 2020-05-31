/**
 * @author Adam Nelson
 * 
 * Description: The purpose of this class is to create an instance of a collection of users, simulating 
 * a music program. The program stores all users made and allows a user to login so they may access their 
 * personal user play lists. 
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class UserCollection {
	
	private List<User> users;
	
	public UserCollection() {
		users = new ArrayList<User>();
	}
	
	/**
	 * This method checks if a user exists within the user collection, returns true
	 * if user exists.
	 * @param username
	 * @return boolean
	 */
	public boolean userExists(String username) {
		for (User user : users) {
			if (user.getName().equals(username)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * This method logs a user in by checking if it exists in the user collection and then
	 * trying the given password. If login is successful method returns the User object,
	 * otherwise null.
	 * @param username
	 * @param password
	 * @return User
	 */
	public User login(String username, String password) {
		if (userExists(username)) {
			for (User user : users) {
				if (user.attemptLogin(password)) {
					return user;
				}
			}
		}
		return null;
	}
	
	/**
	 * This method adds a user to the collection of users if not already added
	 * @param add
	 */
	public void addUser(User add) {
		if (!users.contains(add)) {
			users.add(add);
		}
	}
	
	/**
	 * User collection string representation: { anelson, 0 playlists, hfrank, 2 playlists }
	 */
	public String toString() {
		String str = "{ ";
		for (User user : users) {
			str += user.getName() + ": " + user;
		}
		str += " }";
		return str;
	}


}
