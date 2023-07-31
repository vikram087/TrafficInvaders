package entities;

import processing.core.PApplet;
import processing.core.PImage;
import structure.Game;

/**
 * Represents the vehicle which the player is
 * 
 * @author Eric Decasper
 * @version 3.0
 */
public class Player extends Entity {
	private int disX, disY;
	private boolean left, right, up, down;
	private int velocity, maxVelocity, friction, dragBack;
	private int health, beginHealth;
	private PImage img;
	private String toSet = "images/blueTruck.png";

	/**
	 * Sets the initial state of the player
	 * @param x x coordinate of player
	 * @param y y coordinate of the player
	 * @param width width of the player
	 * @param height height of the player
	 */
	public Player(int x, int y, int width, int height) {

		super(x, y, width, height);

		health = 3;
		beginHealth = 3;
		disX = 0;
		disY = 1;
		left = false;
		right = false;
		up = false;
		down = false;
		velocity = 3;
		maxVelocity = 8;
		friction = 1;
		dragBack = 2;
	}

	/**
	 * Acting of the Player
	 */
	public void act() {
		if (right != left) {
			if (velocity + Math.abs(disX) < maxVelocity) {
				if (right) {
					disX += velocity;
				} else if (left) {
					disX -= velocity;
				}
			}
		}
		if (up != down) {
			if (velocity + Math.abs(disY) < maxVelocity) {
				if (down) {
					disY += velocity;
				} else if (up) {
					disY -= velocity;
				}
			}
		}
		if(disX == 1) {
			disX = 0;
		}
		setLoc(getX() + disX, getY() + disY);
		if (disY > dragBack) {
			disY -= friction;
		}
		if (disY < dragBack) {
			disY += friction;
		}
		if (disX > 0) {
			disX -= friction;
		}
		if (disX < 0) {
			disX += friction;
		}
	}

	/**
	 * draws the player
	 * @param g PApplet object g
	 */
	public void draw(PApplet g) {
		img = g.loadImage(toSet);

		g.pushMatrix();
		g.pushStyle();
		g.fill(0, 255, 255);
		g.tint(255, 255, 255);
		g.image(img, getX(), getY(), getWidth(), getHeight() + 10);

		// Health bar
		g.fill(255, 255, 255);
		g.rect(getX() - 10, getY() + getHeight() + 15, getWidth() + 20, 10);
		if(Game.getCoolDown()) {
			g.fill(255, 0, 0);
		}else {
			g.fill(0, 255, 0);
		}
		
		g.rect(getX() - 10, getY() + getHeight() + 15,
				(int) ((getWidth() + 20) * ((double) getHealth() / getBeginHealth())), 10);
		g.popMatrix();
		g.popStyle();
	}

	public int getHealth() {
		return health;
	}

	public int getBeginHealth() {
		return beginHealth;
	}

	/**
	 * Reduces the player's health everytime the it is hit
	 */
	public void hit() {
		health--;
	}

	public void setUp(boolean x) {
		up = x;
	}

	public void setDown(boolean x) {
		down = x;
	}

	public void setRight(boolean x) {
		right = x;
	}

	public void setLeft(boolean x) {
		left = x;
	}

	public void setImage(String set) {
		toSet = set;
	}

	public void setHealth(int set) {
		beginHealth = set;
		health = set;
	}
	public void setFriction(int x) {
		friction = x;
	}

	public void setVelocity(int set) {
		maxVelocity = set;
	}

	/**
	 * Resets the variables for the player
	 */
	public void reset() {
		health = getBeginHealth();
		disX = 0;
		disY = 1;
		left = false;
		right = false;
		up = false;
		down = false;
	}
}