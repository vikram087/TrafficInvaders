package backgrounds;

/**
 * Manages the backgrounds, picks which one to use when
 * 
 * @author Vikram Penumarti
 * @version 1.0
 */
public class BackgroundManager {
	
	private static Background b = new NormalRoad();

	/**
	 * Sets the background of the game using user input
	 * @param s Determines which background to use
	 */
	public static void setBackground(String s) {
		if (s == "normal") {
			b = new NormalRoad();
		} else if (s == "country") {
			b = new CountryRoad();
		} else if (s == "desert") {
			b = new DesertRoad();
		}
	}

	public static Background getBackground() {
		return b;
	}
}
