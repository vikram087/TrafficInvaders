package screens;

import java.util.ArrayList;

import entities.*;
import processing.core.PApplet;

/**
 * Represents the main game screen.
 * 
 * @author Eric Decasper
 * @version 2.0
 */

public class MainGame extends Screen {
	private static ArrayList<Entity> entities;
	private int speed;
	private int tick;
	private int spawnRate;

	/**
	 * The MainGame constructor initializes variables.
	 * 
	 * @param x the player object.
	 */
	public MainGame(Player x) {
		entities = new ArrayList<>();
		tick = 0;
		speed = 0;
		spawnRate = 60;
	}

	/**
	 * Draws all the entities that should be on the screen on the screen.
	 * 
	 * @param g PApplet drawing object
	 */
	@Override
	public void draw(PApplet g) {

		for (Entity e : entities) {
			e.draw(g);
		}
	}

	/**
	 * The update method adds a new car obstacle every so often at a random x
	 * location on the road.
	 */
	@Override
	public void update() {
		tick++;

		// exponential curve.
		speed = 4 * (int) ((3.377999) * Math.pow(1.00763, (tick / 60)) - 1.34339);
		if (tick > 60) {
			if ((tick / 60.0) % 15.0 == 0.0) {
				spawnRate *= 0.75;
			}
		}
		double rand = Math.random() * 5;
		if (tick % spawnRate == 0) {
			if (rand > 3) {
				entities.add(new SemiTruck((int) (Math.random() * ((590 - 140))) + 140, -125, 50, 125, speed));
			} else if (rand > 1.5) {
				entities.add(new Car((int) (Math.random() * ((590 - 140))) + 140, -75, 50, 75, speed));
			} else {
				entities.add(new RedCar((int) (Math.random() * ((590 - 140))) + 140, -75, 50, 75, speed));
			}

		}
		ArrayList<Entity> rem = new ArrayList<>();
		for (Entity e : entities) {
			if (e.getY() > 800) {
				rem.add(e);
			}
			e.act();
		}

		for (Entity e : rem) {
			entities.remove(e);
		}
		rem.clear();
	}

	/**
	 * The remove method removes the entity passed in from the array list
	 * 
	 * @param e
	 */
	public static void remove(Entity e) {
		entities.remove(entities.indexOf(e));
	}

	public static ArrayList<Entity> getEntities() {
		return entities;
	}
}
