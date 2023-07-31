package music;

import jay.jaysound.JayLayer;

/**
 * In charge of the Music for the game
 * @author Vikram
 * @version 1.0
 */
public class Music
{
	private JayLayer sound;
//	private String[] songs;
	
	/**
	 * Initializes all the playlists containing sound effects and songs
	 */
	public Music()
	{
		super();
		sound = new JayLayer("Songs/","Songs/",false);
//		songs = new String[] {"Crash.mp3", "Song1.mp3", "Song2.mp3", "Song3.mp3", "GameOver.mp3"};

		sound.addPlayList();
		sound.addSong(0, "Song.mp3");
//		sound.addSong(0, "Song3.mp3");
//		sound.addSong(0, "Song1.mp3");

		sound.addPlayList();
		sound.addSong(1, "Crash.mp3");

		sound.addPlayList();
		sound.addSong(2, "GameOver.mp3");
	}
	
	/**
	 * Plays the original song
	 */
	public void playMusic()
	{
		sound.changePlayList(0);
		sound.nextSong();
	}
	
	/**
	 * Plays the game over sound effect
	 */
	public void gameOver()
	{
		sound.changePlayList(2);
		sound.nextSong();
	}
	
	/**
	 * Plays crash sound effect
	 */
	public void crash()
	{
		sound.changePlayList(1);
		sound.nextSong();
	}
	
	/**
	 * Toggles music on/off
	 */
	public void toggle()
	{
		if(sound.isPlaying())
		{
			sound.stopSong();
		}
		else
		{
			playMusic();
		}
	}
}