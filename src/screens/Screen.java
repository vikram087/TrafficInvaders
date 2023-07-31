package screens;

import processing.core.PApplet;
/**
 * The screen class is the superclass of all screens and all the are displayed between games including the 
 * main menu and other future screens.
 * @author Vikram Penumarti
 *
 */
public abstract class Screen {
	public abstract void draw(PApplet g);
	public abstract void update();
	
	/**
	 * Returns negative one right now if the mouse is clicked in screen. Used for debugging.
	 * @param x
	 * @param y
	 * @return
	 */
	public int clickMouse(int x, int y) {
		return -1;
	}
}
