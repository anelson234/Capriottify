/**
 * @author Adam Nelson
 * 
 * Description: The purpose of this class is to create a library that stores Song 
 * objects. Program does this by making a map and taking the song name, linking it 
 * to the Song object, in alphabetical order.
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Library {
	
	private TreeMap<String,Song> library;
	
	public Library() {
		library = new TreeMap<String, Song>();
	}
	
	/**
	 * This method returns a Song object if it exists within the 
	 * library, otherwise returns null.
	 * @param title
	 * @return Song
	 */
	public Song getSong(String title) {
		if (library.containsKey(title)) {
			return library.get(title);
		}else {
			return null;
		}
	}
	
	/**
	 * This method returns a list of all the songs within the library
	 * @return List<Song>
	 */
	public List<Song> getAllSongs(){
		List<Song> songs = new ArrayList<Song>();
		for (String key : library.keySet()) {
			songs.add(library.get(key));
		}
		return songs;
	}
	
	/**
	 * This method adds a song object to the library if it isn't 
	 * already added.
	 * @param song
	 */
	public void addSong(Song song) {
		if (!library.containsKey(song.getTitle())) {
			library.put(song.getTitle(),song);
		}
	}
	
	/**
	 * This method removes a song from the library if it is 
	 * contained within it.
	 * @param song
	 */
	public void removeSong(Song song) {
		if (library.containsKey(song.getTitle())) {
			library.remove(song.getTitle());
		}
	}
	
	/**
	 * Library's string representation prints out every Song's toString method
	 * on a new line.
	 */
	public String toString() {
		String result = "";
		int size = library.keySet().size();
		for (String key : library.keySet()) {
			if (size > 1) {
				result += library.get(key) + "\n";
				size -= 1;
			}else {
				result += library.get(key);
				size +=1 ;
			}
		}
		return result;
	}

}
