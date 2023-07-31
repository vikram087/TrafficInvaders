package screens;

import processing.core.PApplet;
import processing.core.PFont;

/**
 * Represents the instructions of the game
 * @author Karan Dalal
 * @version 1.0
 */
public class Instructions extends Screen {

	private PFont font;
	private static int finalScore;

	/**
	 * @param PApplet g - A PApplet object which sets the main menu
	 */
	public void draw(PApplet g) {
		font = g.createFont("lib/font.ttf", 40);
		g.textFont(font);
		g.pushStyle();
		g.background(0, 0, 0);
		g.fill(74, 134, 232);
		g.textSize(43);
		g.text("Instructions", g.width / 2 - g.textWidth("Instructions") / 2, 105);
		g.fill(255, 255, 255);
		g.textSize(40);
		g.text("Instructions", g.width / 2 - g.textWidth("Instructions") / 2, 100);
		g.textSize(13);
		String a = "Welcome to Traffic Invaders; Here are the";
		String b = "controls for the game. Use WASD to move or";
		String c = "use mouse movement by pressing the E key.";
		String d = "If you collide with the bottom of the screen";
		String e = "or an incoming car you will lose a unit of health.";
		String k = "Whenever the health bar is red the car is invulnerable.";
		String f = "Depending on your car your HP varies. Make sure to";
		String h = "pick whatever car fits your playstyle! Try to make";
		String i = "it as far as you can to set a new highscore!";
		g.text(a, g.width / 2 - g.textWidth(a) / 2, g.height / 2 - 100);
		g.text(b, g.width / 2 - g.textWidth(b) / 2, g.height / 2 - 80);
		g.text(c, g.width / 2 - g.textWidth(c) / 2, g.height / 2 - 60);
		g.text(d, g.width / 2 - g.textWidth(d) / 2, g.height / 2 - 40);
		g.text(e, g.width / 2 - g.textWidth(e) / 2, g.height / 2 - 20);
		g.text(k, g.width / 2 - g.textWidth(k) / 2, g.height / 2);
		g.text(f, g.width / 2 - g.textWidth(f) / 2, g.height / 2 + 20);
		g.text(h, g.width / 2 - g.textWidth(h) / 2, g.height / 2 +40);
		g.text(i, g.width / 2 - g.textWidth(i) / 2, g.height / 2 +60);
		g.strokeWeight(4);
		g.stroke(58, 130, 245);
		g.fill(74, 134, 232, 75);
		g.rect(g.width / 2 - 135, 500, 270, 45, 13, 13, 13, 13);
		g.fill(255, 255, 255);
		g.textSize(20);
		g.text("Return", g.width / 2 - g.textWidth("Return") / 2, 535);
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
