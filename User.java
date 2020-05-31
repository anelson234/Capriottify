/**
 * @author Adam Nelson
 * 
 * Description: The purpose of this class is to create an instance of a user.
 * A user stores the name, password and all of that users playlists. You can
 * add to your playlists, or remove and play specific playlists.
 *
 */
import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String name;
	private String password;
	private List<Playlist> userPlayLists;
	
	public User(String name, String password) {
		this.name = name;
		this.password = password;
		userPlayLists = new ArrayList<Playlist>();
	}
	
	/**
	 * This method returns the users name
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * This method takes a given password and checks to see if it
	 * matches the users password. If passwords match, login attempt
	 * was a success and returns true, otherwise false
	 * @param password
	 * @return boolean
	 */
	public boolean attemptLogin(String password) {
		if (this.password.equals(password)) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * This method adds a new playlist to the list of userPlaylists 
	 * @param newPlaylist
	 */
	public void addPlaylist(Playlist newPlaylist) {
		if (!userPlayLists.contains(newPlaylist)) {
			userPlayLists.add(newPlaylist);
		}
	}
	
	/**
	 * This method returns a list of all the users playlists
	 * @return List<Playlist>
	 */
	public List<Playlist> getPlaylists(){
		return userPlayLists;
	}
	
	/**
	 * This method selects a specific playlist by name and plays 
	 * that entire playlist 
	 * @param name
	 */
	public void selectPlaylist(String name) {
		for (Playlist playList : userPlayLists) {
			if (playList.getName().equals(name)) {
				playList.play();
			}
		}
	}
	
	/**
	 * User string representation: "name", "# of playlists" playlists
	 */
	public String toString() {
		return name + ", " + userPlayLists.size() + " playlists";
	}

}
