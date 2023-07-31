package screens;

import backgrounds.Background;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PFont;

/**
 * Is the opening screen which the player will see when they first launch the
 * game, die, or want to quit
 * 
 * @author Karan Dalal
 * @version 2.0
 */
public class GameOver extends Screen {

	private PFont font;
	private static int finalScore;

	/**
	 * sets the initial state of the game over screen
	 */
	public GameOver() {
		finalScore = Background.getScore();
	}

	/**
	 * Draws the game over on the drawing surface
	 * 
	 * @param PApplet g - A PApplet object which sets the main menu
	 */
	public void draw(PApplet g) {
		font = g.createFont("lib/font.ttf", 40);
		g.textFont(font);
		g.pushStyle();
		g.background(0, 0, 0);
		g.fill(74, 134, 232);
		g.textSize(43);
		g.text("Game Over", g.width / 2 - g.textWidth("Game Over") / 2, 205);
		g.fill(255, 255, 255);
		g.filter(PConstants.BLUR, 6);
		g.textSize(40);
		g.text("Game Over", g.width / 2 - g.textWidth("Game Over") / 2, 200);
		g.textSize(25);
		g.text("You Final Score Was: " + finalScore,
				g.width / 2 - g.textWidth("You Final Score Was: " + finalScore) / 2, g.height / 2 + 20);
		g.strokeWeight(4);
		g.stroke(58, 130, 245);
		g.fill(74, 134, 232, 75);
		g.rect(g.width / 2 - 135, 400, 270, 45, 13, 13, 13, 13);
		g.fill(255, 255, 255);
		g.textSize(20);
		g.text("Play Again", g.width / 2 - g.textWidth("Play Again") / 2, 435);
		g.popStyle();

	}

	/**
	 * Updates the screen
	 */
	public void update() {

	}

	public static double finalScore() {
		return finalScore;
	}

}
