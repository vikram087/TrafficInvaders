package screens;

import java.util.Collections;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;
import structure.Game;

/**
 * Is the opening screen which the player will see when they first launch the
 * game, die, or want to quit
 * 
 * @author Karan Dalal
 * @version 2.0
 */
public class MainMenu extends Screen {

	private PImage bg;
	private PFont font;

	/**
	 * Will initialize variables here later on
	 */
	public MainMenu() {
	}

	/**
	 * Draws the main menu on the drawing surface
	 * 
	 * @param PApplet g - A PApplet object which sets the main menu
	 */
	public void draw(PApplet g) {
		g.push();
		font = g.createFont("lib/font.ttf", 40);
		g.textFont(font);
		bg = g.loadImage("lib/background.png");
		g.background(bg);
		g.pushStyle();
		g.fill(74, 134, 232);
		g.textSize(43);
		g.text("Traffic", g.width / 2 - g.textWidth("Traffic") / 2, 105);
		g.text("Invaders", g.width / 2 - g.textWidth("Invaders") / 2, 155);
		g.popStyle();
		g.fill(255, 255, 255);
		g.textSize(40);
		g.text("Traffic", g.width / 2 - g.textWidth("Traffic") / 2, 100);
		g.text("Invaders", g.width / 2 - g.textWidth("Invaders") / 2, 150);
		// Start Button
		g.strokeWeight(4);
		g.stroke(58, 130, 245);
		g.fill(74, 134, 232, 75);
		g.rect(g.width / 2 - 135, 200, 270, 45, 13, 13, 13, 13);
		g.fill(255, 255, 255);
		g.textSize(20);
		g.text("Start", g.width / 2 - g.textWidth("Start") / 2, 235);
		// Background Button
		g.strokeWeight(4);
		g.stroke(58, 130, 245);
		g.fill(74, 134, 232, 75);
		g.rect(g.width / 2 - 135, 270, 270, 45, 13, 13, 13, 13);
		g.fill(255, 255, 255);
		g.textSize(20);
		g.text("Backgrounds", g.width / 2 - g.textWidth("Backgrounds") / 2, 305);
		// Players Button
		g.strokeWeight(4);
		g.stroke(58, 130, 245);
		g.fill(74, 134, 232, 75);
		g.rect(g.width / 2 - 135, 340, 270, 45, 13, 13, 13, 13);
		g.fill(255, 255, 255);
		g.textSize(20);
		g.text("Players", g.width / 2 - g.textWidth("Players") / 2, 375);
		if (Game.getScores().size() != 0) {
			g.textSize(30);
			g.text("High Score:" + Collections.max(Game.getScores()),
					g.width / 2 - g.textWidth("High Score:" + Collections.max(Game.getScores())) / 2, 550);
		}
		// Instructions Button
		g.strokeWeight(4);
		g.stroke(58, 130, 245);
		g.fill(74, 134, 232, 75);
		g.rect(g.width / 2 - 135, 410, 270, 45, 13, 13, 13, 13);
		g.fill(255, 255, 255);
		g.textSize(20);
		g.text("Instructions", g.width / 2 - g.textWidth("Instructions") / 2, 445);
		g.pop();

	}

	/**
	 * Updates the screen
	 */
	public void update() {

	}

	/**
	 * @param mouseX - the x coordinate of the click
	 * @param mouseY - the y coordinate of the click The clicked method checks if
	 *               the click was within the button area, and returns 1 if it is.
	 */
	public static int clicked(int mouseX, int mouseY) {
		if (mouseX > 265 && mouseX < 535 && mouseY > 200 && mouseY < 245) {
			return 1;
		} else if (mouseX > 265 && mouseX < 535 && mouseY > 270 && mouseY < 315) {
			return 2;
		} else if (mouseX > 265 && mouseX < 535 && mouseY > 340 && mouseY < 395) {
			return 3;
		} else if (mouseX > 265 && mouseX < 535 && mouseY > 410 && mouseY < 445) {
			return 4;
		} else
			return 0;
	}

}
