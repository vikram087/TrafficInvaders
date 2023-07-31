package screens;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PFont;
import processing.core.PImage;

/**
 * The background selector screen.
 * 
 * @author Karan Dalal
 * @version 2.0
 */
public class BackgroundSelect extends Screen {

	private PImage bg;
	private PFont font;
	private PImage background1, background2, background3;
	private static String selection = "normal";
//	private double mouseX = 0, mouseY = 0;

	
	/**
	 * Draws the game over on the drawing surface
	 * 
	 * @param PApplet g - A PApplet object which sets the main menu
	 */
	public void draw(PApplet g) {
//		mouseX = g.mouseX;
//		mouseY = g.mouseY;
		background1 = g.loadImage("images/NormalRoad.png");
		background2 = g.loadImage("images/CountryRoad.png");
		background3 = g.loadImage("images/DesertRoad.png");
		g.push();
		font = g.createFont("lib/font.ttf", 40);
		g.textFont(font);
		bg = g.loadImage("lib/background.png");
		g.background(bg);
		g.pushStyle();
		g.fill(74, 134, 232);
		g.textSize(43);
		g.text("Select Background", g.width / 2 - g.textWidth("Select Background") / 2, 105);
		g.popStyle();
		g.fill(255, 255, 255);
		g.textSize(40);
		g.text("Select Background", g.width / 2 - g.textWidth("Select Background") / 2, 100);
		// Sections
		g.strokeWeight(4);
		// Section 1
		if (selection == "normal") {
			g.stroke(255, 255, 255);
		} else {
			g.noStroke();
		}
		g.fill(74, 134, 232, 75);
		g.rect(50, 175, 200, 300, 13, 13, 13, 13);
		g.fill(255, 255, 255);
		g.textSize(15);
		g.text("Normal Road", (100 - (g.textWidth("Normal Road") / 2)) + 50, 320);
		g.textSize(12);
		g.text("Because who", (100 - (g.textWidth("Because who") / 2)) + 50, 360);
		g.text("doesn't love", (100 - (g.textWidth("doesn't love") / 2)) + 50, 380);
		g.text("original?", (100 - (g.textWidth("original?") / 2)) + 50, 400);
		g.push();
		g.imageMode(PConstants.CENTER);
		g.translate(150, 230);
		g.image(background1, (float) 0, (float) 0, (float) (802 * 0.14), (float) (598 * 0.14));
		g.pop();
		// Section 2
		if (selection == "country") {
			g.stroke(255, 255, 255);
		} else {
			g.noStroke();
		}
		g.fill(74, 134, 232, 75);
		g.rect(300, 175, 200, 300, 13, 13, 13, 13);
		g.fill(255, 255, 255);
		g.textSize(15);
		g.text("Country Road", (100 - (g.textWidth("Country Road") / 2)) + 300, 320);
		g.textSize(12);
		g.text("Country roads", (100 - (g.textWidth("Country roads") / 2)) + 300, 360);
		g.text("take me", (100 - (g.textWidth("take me") / 2)) + 300, 380);
		g.text("hoomeeeeee", (100 - (g.textWidth("hoomeeeeee") / 2)) + 300, 400);
		g.push();
		g.imageMode(PConstants.CENTER);
		g.translate(400, 230);
		g.image(background2, (float) 0, (float) 0, (float) (804 * 0.139651741), (float) (601 * 0.139301165));
		g.pop();
		// Section 3
		if (selection == "desert") {
			g.stroke(255, 255, 255);
		} else {
			g.noStroke();
		}
		g.fill(74, 134, 232, 75);
		g.rect(550, 175, 200, 300, 13, 13, 13, 13);
		g.fill(255, 255, 255);
		g.textSize(15);
		g.text("Desert Road", (100 - (g.textWidth("Desert Road") / 2)) + 550, 320);
		g.textSize(12);
		g.text("Careful, don't", (100 - (g.textWidth("Careful, don't") / 2)) + 550, 360);
		g.text("get sand in", (100 - (g.textWidth("get sand in") / 2)) + 550, 380);
		g.text("your socks!", (100 - (g.textWidth("your socks") / 2)) + 550, 400);
		g.push();
		g.imageMode(PConstants.CENTER);
		g.translate(650, 230);
		g.image(background3, (float) 0, (float) 0, (float) (796 * 0.141055276), (float) (603 * 0.138839138));
		g.pop();

		// Return Button
		g.strokeWeight(4);
		g.stroke(58, 130, 245);
		g.fill(74, 134, 232, 75);
		g.rect(g.width / 2 - 135, 500, 270, 45, 13, 13, 13, 13);
		g.fill(255, 255, 255);
		g.textSize(20);
		g.text("Return", g.width / 2 - g.textWidth("Return") / 2, 535);
		g.pop();

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	public static void setSelection(String s) {
		selection = s;
	}

}
