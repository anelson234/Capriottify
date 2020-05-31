/**
 * @author Adam Nelson
 * 
 * Description: The purpose of this class is to create an instance of a song and 
 * for every song it has a title, an artist and how many times the song has been
 * played.
 *
 */
public class Song {
	
	private String title;
	private String artist;
	private int timesPlayed;
	
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
		timesPlayed = 0;
	}
	
	/**
	 * This method returns the song title
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * This method returns the artist of the song
	 * @return artist
	 */
	public String getArtist() {
		return artist;
	}
	
	/**
	 * This method returns the amount of times a song has been played
	 * @return timesPlayed
	 */
	public int getTimesPlayed() {
		return timesPlayed;
	}
	
	/**
	 * This method when called plays the song, doing so increments 
	 * the amount of plays by 1 and prints out the title, artist
	 * and times played.
	 */
	public void play() {
		timesPlayed += 1;
		System.out.println(title + " by " + artist + ", " + timesPlayed + " play(s)");
	}
	
	/**
	 * Song string representation: "title" by "artist", "timesPlayed" play(s)
	 */
	public String toString() {
		return title + " by " + artist + ", " + timesPlayed + " play(s)";
	}

}
