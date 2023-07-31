package backgrounds;

import processing.core.PApplet;
import processing.core.PFont;

/**
 * Superclass of all backgrounds
 * 
 * @author Vikram Penumarti
 * @version 2.0
 */
public class Background {
	static float time;
	static int score;
	static int difficulty;
	int runs;
	private PFont font;
	private static boolean paused = false;

	private int r, g, b;

//	public static boolean paused = false;

	private static int firstLineX;
	private static int secondLineX;

	/**
	 * Sets the amount of times draw() has run, the time passed, and the difficulty
	 * factor, and gets colors
	 * 
	 * @param r the red color value
	 * @param g the green color value
	 * @param b the blue color value
	 */
	public Background(int r, int g, int b) {
		score = 0;
		runs = 0;
		time = 0;
		difficulty = 1;

		firstLineX = 0;
		secondLineX = 0;

		this.r = r;
		this.g = g;
		this.b = b;
	}

	/**
	 * Method that draws the backgrounds
	 * 
	 * @param s PApplet object
	 */
	public void draw(PApplet s) {
		font = s.createFont("lib/font.ttf", 40);
		s.textFont(font);
		s.textSize(20);
		s.background(r, g, b);
		// every time draw() is called time increases
		if (!paused) {
			time++;
			score++;
		}
		s.text("Score: " + score, s.width / 16, s.height / 12);
		scroll(s);
		paused(s);

	}

	/**
	 * Pause screen
	 * @param s PApplet object s
	 */
	public void paused(PApplet s) {
		s.fill(0, 0, 0);
		s.rect(730, 10, 50, 50);
		s.fill(255, 255, 255);
		if (!paused) {
			s.rect(740, 18, 12, 34);
			s.rect(758, 18, 12, 34);
		} else {
			s.triangle(740, 18, 770, 35, 740, 52);
			s.push();
			s.strokeWeight(4);
			s.stroke(58, 130, 245);
			s.fill(74, 134, 232, 75);
			s.rect(s.width / 2 - 135, 10, 270, 45, 13, 13, 13, 13);
			s.fill(255, 255, 255);
			s.textSize(20);
			s.text("Quit", s.width / 2 - s.textWidth("Quit") / 2, 45);
			s.pop();
		}
	}

	/**
	 * Scrolls down the screen
	 * 
	 * @param s PApplet object
	 */
	public void scroll(PApplet s) {
		runs++;

		time += difficulty;

		firstLineX = s.width / 5;
		secondLineX = s.width - s.width / 5;
		s.line(firstLineX, 0, firstLineX, s.height);
		s.line(secondLineX, 0, secondLineX, s.height);
	}

	public static int getFirstLineX() {
		return firstLineX;
	}

	public static int getSecondLineX() {
		return secondLineX;
	}

	public static float getSpeed() {
		return time;
	}

	public static int getDifficulty() {
		return difficulty;
	}

	public static int getScore() {
		return score;
	}

	/**
	 * Resets score and time
	 */
	public void reset() {
		score = 0;
		time = 0;
	}

	public static void setPaused(boolean b) {
		paused = b;
	}

	public static boolean getPaused() {
		return paused;
	}

}