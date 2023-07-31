package entities;

import processing.core.PApplet;

/**
 * The superclass to Car and Player, contain base behaviors of the two
 * @author Eric Decasper
 * @version 3.0
 */
public abstract class Entity {
	private int x, y, width, height;

	
	/**
	 * The entity constructors initializes the fields to the parameters. 
	 * @param x integer x coordinate value of the entity
	 * @param y integer y coordinate value of the entity
	 * @param width integer width value of the entity
	 * @param height integer height value of the entity
	 */
	public Entity(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
	}
	
	public abstract void act();

	public abstract void draw(PApplet g);
	
	/**
	 * The is point inside value checks if the point passed into the method is inside the entity.
	 * @param x integer x coordinate of the point you are checking.
	 * @param y integer y coordinate of the point you are checking
	 * @return Boolean whether the point is inside the method or not. 
	 */
	public boolean isPointInside(int x, int y) {
		if ((getX() < x && x < getX() + width) && (this.getY() < y && y < (getY() + height))) {
			return true;
		}else {
			return false;
		}
	}
	public int getX(){
		return x; 
	}
	public int getY() {
		return y;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setLoc(int x, int y) {
		this.x = x; 
		this.y = y;
	}
	
}