package entities;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * The redcar which act as obstacles to the main character
 * @author Eric Decasper
 * @version 1.0
 */
public class RedCar extends Entity
{
	private PImage img;
	private int speed;
	
	/**
	 * Sets the initial state of the RedCar
	 * @param x x coordinate of RedCar
	 * @param y y coordinate of the RedCar
	 * @param width width of the RedCar
	 * @param height height of the RedCar
	 */
	public RedCar(int x, int y, int width, int height, int speed) {
		super(x, y, width, height);
		this.speed = speed;
		// TODO Auto-generated constructor stub
	}

	/**
	 * The act method handles all the movement of the car moving the cars down the road at the specified rate.
	 */
	@Override
	public void act() {
		// TODO Auto-generated method stub
		setLoc(getX(), getY() + speed);
	}

	/**
	 * The draw method draws the car with all its attributes.
	 * @param g the PApplet object passed into the method.
	 */
	@Override
	public void draw(PApplet g) {
		// TODO Auto-generated method stub
		img = g.loadImage("images/redOpposing.png");
		g.image(img, getX(), getY(), getWidth(), getHeight() + 10);

	}

}
