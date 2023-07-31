package screens;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PFont;
import processing.core.PImage;
/**
 * The player selection menu screen.
 * 
 * @author Karan Dalal
 * @version 2.0
 */
public class PlayerSelect extends Screen {

	private PImage bg;
	private PFont font;
	private PImage player1a, player1b, player2a, player2b, player3a, player3b;
	private static String selection = "default";
	private static String selectionPlay1 = "blue";
	private static String selectionPlay2 = "black";
	private static String selectionPlay3 = "pink";
//	private double mouseX = 0, mouseY = 0;

	/**
	 * Draws the player select screen
	 * @param g PApplet object
	 */
	public void draw(PApplet g) {
//		mouseX = g.mouseX;
//		mouseY = g.mouseY;
		player1a = g.loadImage("images/blueTruck.png");
		player1b = g.loadImage("images/greenTruck.png");
		player2a = g.loadImage("images/policeCar.png");
		player2b = g.loadImage("images/bluePoliceCar.png");
		player3a = g.loadImage("images/pinkVan.png");
		player3b = g.loadImage("images/greyVan.png");
		g.push();
		font = g.createFont("lib/font.ttf", 40);
		g.textFont(font);
		bg = g.loadImage("lib/background.png");
		g.background(bg);
		g.pushStyle();
		g.fill(74, 134, 232);
		g.textSize(43);
		g.text("Select Player", g.width / 2 - g.textWidth("Select Player") / 2, 105);
		g.popStyle();
		g.fill(255, 255, 255);
		g.textSize(40);
		g.text("Select Player", g.width / 2 - g.textWidth("Select Player") / 2, 100);
		// Sections
		g.strokeWeight(4);
		// Section 1
		if (selection == "default") {
			g.stroke(255, 255, 255);
		} else {
			g.noStroke();
		}
		g.fill(74, 134, 232, 75);
		g.rect(50, 175, 200, 300, 13, 13, 13, 13);
		g.fill(255, 255, 255);
		g.textSize(15);
		g.text("Truck", (100 - (g.textWidth("Truck") / 2)) + 50, 300);
		g.push();
		g.imageMode(PConstants.CENTER);
		g.translate(150, 225);
		g.rotate((float) (PConstants.PI / 2.0));
		if (selectionPlay1 == "blue") {
			g.image(player1a, (float) 0, (float) 0, (float) (193 * 0.351813472), (float) (384 * 0.348177083));
		} else {
			g.image(player1b, (float) 0, (float) 0, (float) (193 * 0.351813472), (float) (384 * 0.348177083));
		}
		g.pop();
		// Selector Car
		g.pushStyle();
		g.strokeWeight(3);
		g.push();
		if (selectionPlay1 == "blue") {
			g.stroke(255, 255, 255);
		} else {
			g.noStroke();
		}
		g.fill(56, 156, 220);
		g.rect(110, 320, 30, 30, 13, 13, 13, 13);
		g.pop();
		g.push();
		if (selectionPlay1 == "green") {
			g.stroke(255, 255, 255);
		} else {
			g.noStroke();
		}
		g.fill(200, 204, 140);
		g.rect(160, 320, 30, 30, 13, 13, 13, 13);
		g.pop();
		g.popStyle();
		g.pushStyle();
		g.textSize(12);
		g.text("Speed: Medium", (100 - (g.textWidth("Speed: Medium") / 2)) + 50, 415);
		g.text("Lives: 3", (100 - (g.textWidth("Lives: 3") / 2)) + 50, 440);
		g.popStyle();

		// Section 2
		if (selection == "cop") {
			g.stroke(255, 255, 255);
		} else {
			g.noStroke();
		}
		g.fill(74, 134, 232, 75);
		g.rect(300, 175, 200, 300, 13, 13, 13, 13);
		g.fill(255, 255, 255);
		g.textSize(15);
		g.text("Cop Car", (100 - (g.textWidth("Cop Car") / 2)) + 300, 300);
		g.push();
		g.imageMode(PConstants.CENTER);
		g.translate(400, 225);
		g.rotate((float) (PConstants.PI / 2.0));
		if (selectionPlay2 == "black") {
			g.image(player2a, (float) 0, (float) 0, (float) (186 * 0.350918635), (float) (381 * 0.350918635));
		} else {
			g.image(player2b, (float) 0, (float) 0, (float) (186 * 0.350918635), (float) (381 * 0.350918635));
		}
		g.pop();
		// Selector Car
		g.pushStyle();
		g.strokeWeight(3);
		g.push();
		if (selectionPlay2 == "black") {
			g.stroke(255, 255, 255);
		} else {
			g.noStroke();
		}
		g.fill(0, 0, 0);
		g.rect(360, 320, 30, 30, 13, 13, 13, 13);
		g.pop();
		g.push();
		if (selectionPlay2 == "blue2") {
			g.stroke(255, 255, 255);
		} else {
			g.noStroke();
		}
		g.fill(88, 164, 244);
		g.rect(410, 320, 30, 30, 13, 13, 13, 13);
		g.pop();
		g.popStyle();
		g.pushStyle();
		g.textSize(12);
		g.text("Speed: Fast", (100 - (g.textWidth("Speed: Fast") / 2)) + 300, 415);
		g.text("Lives: 2", (100 - (g.textWidth("Lives: 2") / 2)) + 300, 440);
		g.popStyle();

		// Section 3
		if (selection == "van") {
			g.stroke(255, 255, 255);
		} else {
			g.noStroke();
		}
		g.fill(74, 134, 232, 75);
		g.rect(550, 175, 200, 300, 13, 13, 13, 13);
		g.fill(255, 255, 255);
		g.textSize(15);
		g.text("Van", (100 - (g.textWidth("Van") / 2)) + 550, 300);
		g.push();
		g.imageMode(PConstants.CENTER);
		g.translate(650, 225);
		g.rotate((float) (PConstants.PI / 2.0));
		if (selectionPlay3 == "pink") {
			g.image(player3a, (float) 0, (float) 0, (float) (211 * 0.321800948), (float) (383 * 0.349086162));
		} else {
			g.image(player3b, (float) 0, (float) 0, (float) (211 * 0.321800948), (float) (383 * 0.349086162));
		}
		g.pop();
		// Selector Car
		g.pushStyle();
		g.strokeWeight(3);
		g.push();
		if (selectionPlay3 == "pink") {
			g.stroke(255, 255, 255);
		} else {
			g.noStroke();
		}
		g.fill(232, 84, 164);
		g.rect(610, 320, 30, 30, 13, 13, 13, 13);
		g.pop();
		g.push();
		if (selectionPlay3 == "grey") {
			g.stroke(255, 255, 255);
		} else {
			g.noStroke();
		}
		g.fill(195, 204, 199);
		g.rect(660, 320, 30, 30, 13, 13, 13, 13);
		g.pop();
		g.popStyle();
		g.pushStyle();
		g.textSize(12);
		g.text("Speed: Slow", (100 - (g.textWidth("Speed: Slow") / 2)) + 550, 415);
		g.text("Lives: 4", (100 - (g.textWidth("Lives: 4") / 2)) + 550, 440);
		g.popStyle();

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
	
	public static void selectionPlay1(String s) {
		selectionPlay1 = s;
	}
	
	public static void selectionPlay2(String s) {
		selectionPlay2 = s;
	}
	
	public static void selectionPlay3(String s) {
		selectionPlay3 = s;
	}

}
