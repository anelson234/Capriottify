/**
 * @author Adam Nelson
 * 
 * Description: The purpose of this class is to create a play list for each instance of a user.
 * The program creates a list of Song objects and allows the whole play list of songs to be played.
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class Playlist {
	
	private String name;
	private List<Song> contents;
	
	public Playlist(String name) {
		this.name = name;
		contents = new ArrayList<Song>();
	}
	
	public Playlist(String name, List<Song> contents) {
		this.name = name;
		this.contents = contents;
	}
	
	/**
	 * This method returns the name of the play list
	 * @return name 
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * This method adds a song to the play list if it is not already contained 
	 * in the play list.
	 * @param song
	 */
	public void addSong(Song song) {
		if (!contents.contains(song)) {
			contents.add(song);
			}
		}
	
	/**
	 * This method goes through the entire play list playing each Song object
	 */
	public void play() {
		for (int i = 0; i < contents.size(); i++) {
			contents.get(i).play();
		}
	}
	
	/**
	 * This method removes a song from the play list if it is in the play list
	 * @param song
	 */
	public void removeSong(Song song) {
		if (contents.contains(song)) {
			contents.remove(song);
		}
	}

}
