package structure;

import java.util.ArrayList;
import backgrounds.*;
import entities.*;
import music.Music;
import processing.core.PApplet;
import screens.BackgroundSelect;
import screens.GameOver;
import screens.Instructions;
import screens.MainGame;
import screens.MainMenu;
import screens.PlayerSelect;
import screens.Screen;

/**
 * The Game class represents the actual game panel where the game is played on
 *
 * @author Karan Dalal
 * @version 4.0
 *
 */
public class Game extends PApplet {

	private Screen screen;

	private Music music = new Music();

	private Background b;
//	private int rCol, gCol, bCol;
//	private PApplet g;
	private static ArrayList<Integer> allScores = new ArrayList<Integer>();

	private  static CurrentScreen current;
	private int tick, lastHit;
	private static boolean onCoolDown;
	private boolean mouseMode;

	private enum CurrentScreen {
		MENU, PLAYERSELECT, BACKGROUNDSELECT, INSTRUCTIONS, GAME, GAMEOVER;
	}

	private static Player player = new Player(800 / 2, 400, 50, 75);

	/**
	 * The setup method sets up the game panel for play with the MainMenu screen.
	 */
	public void setup() {
		tick = 0;
		lastHit = 0;
		current = CurrentScreen.MENU;
		screen = new MainMenu();
		surface.setSize(800, 600);
		surface.setResizable(false);
		mouseMode = false;
		music.playMusic();
	}

	/**
	 * The draw method in game draws the screens and everything that is displayed on
	 * the window
	 */
	public void draw() {
		b = BackgroundManager.getBackground();
		b.draw(this);
		if (current == CurrentScreen.GAME) {
			player.draw(this);
			if (!Background.getPaused()) {
				player.act();
			}
			collision(player);
		}
		if (current == CurrentScreen.GAME && mouseMode) {
			if (player.getX() + player.getWidth() > mouseX) {
				player.setLeft(true);
			} else {
				player.setLeft(false);
			}
			if (player.getX() < mouseX) {
				player.setRight(true);
			} else {
				player.setRight(false);
			}
			if (player.getY() + player.getHeight() > mouseY) {
				player.setUp(true);
			} else {
				player.setUp(false);
			}
			if (player.getY() < mouseY) {
				player.setDown(true);
			} else {
				player.setDown(false);
			}
		}
		screen.draw(this);
		if (!Background.getPaused()) {
			screen.update();
		}

	}

	/**
	 * The mousePressed method detects when the mouse is pressed and checks whether
	 * to switch the screen and start the game
	 */
	public void mousePressed() {
		int type = MainMenu.clicked(mouseX, mouseY);
		if (current == CurrentScreen.MENU) {
			if (type == 1) {
				player.reset();
				player.setLoc(400, 400);
				screen = new MainGame(player);
				b.reset();
				Background.setPaused(false);
				current = CurrentScreen.GAME;
			} else if (type == 2) {
				screen = new BackgroundSelect();
				current = CurrentScreen.BACKGROUNDSELECT;
			} else if (type == 3) {
				screen = new PlayerSelect();
				current = CurrentScreen.PLAYERSELECT;
			} else if (type == 4) {
				screen = new Instructions();
				current = CurrentScreen.INSTRUCTIONS;
			}
		} else if (current == CurrentScreen.PLAYERSELECT) {
			if (mouseX > 50.0 && mouseX < 250.0 && mouseY > 175.0 && mouseY < 375.0) {
				PlayerSelect.setSelection("default");
				if (mouseX > 160 && mouseX < 190 && mouseY > 320 && mouseY < 350) {
					PlayerSelect.selectionPlay1("green");
					player.setImage("images/greenTruck.png");
				} else {
					PlayerSelect.selectionPlay1("blue");
					player.setImage("images/blueTruck.png");
				}
				player.setHealth(3);
				player.setVelocity(9);
			} else if (mouseX > 300.0 && mouseX < 500.0 && mouseY > 175.0 && mouseY < 375.0) {
				PlayerSelect.setSelection("cop");
				if (mouseX > 410 && mouseX < 440 && mouseY > 320 && mouseY < 350) {
					PlayerSelect.selectionPlay2("blue2");
					player.setImage("images/bluePoliceCar.png");
				} else {
					PlayerSelect.selectionPlay2("black");
					player.setImage("images/policeCar.png");
				}
				player.setHealth(2);
				player.setVelocity(12);
				player.setFriction(2);
			} else if (mouseX > 550.0 && mouseX < 750.0 && mouseY > 175.0 && mouseY < 375.0) {
				PlayerSelect.setSelection("van");
				if (mouseX > 660 && mouseX < 690 && mouseY > 320 && mouseY < 350) {
					PlayerSelect.selectionPlay3("grey");
					player.setImage("images/greyVan.png");
				} else {
					PlayerSelect.selectionPlay3("pink");
					player.setImage("images/pinkVan.png");
				}
				player.setHealth(4);
				player.setVelocity(7);
			} else if (mouseX > 265 && mouseX < 535 && mouseY > 500 && mouseY < 545) {
				screen = new MainMenu();
				current = CurrentScreen.MENU;
			}
		} else if (current == CurrentScreen.BACKGROUNDSELECT) {
			if (mouseX > 50.0 && mouseX < 250.0 && mouseY > 175.0 && mouseY < 375.0) {
				BackgroundSelect.setSelection("normal");
				BackgroundManager.setBackground("normal");
				b = BackgroundManager.getBackground();
			} else if (mouseX > 300.0 && mouseX < 500.0 && mouseY > 175.0 && mouseY < 375.0) {
				BackgroundSelect.setSelection("country");
				BackgroundManager.setBackground("country");
				b = BackgroundManager.getBackground();
			} else if (mouseX > 550.0 && mouseX < 750.0 && mouseY > 175.0 && mouseY < 375.0) {
				BackgroundSelect.setSelection("desert");
				BackgroundManager.setBackground("desert");
				b = BackgroundManager.getBackground();
			} else if (mouseX > 265 && mouseX < 535 && mouseY > 500 && mouseY < 545) {
				screen = new MainMenu();
				current = CurrentScreen.MENU;
			}
		} else if (current == CurrentScreen.GAMEOVER) {
			if (mouseX > 265 && mouseX < 535 && mouseY > 400 && mouseY < 445) {
				player.reset();
				music.playMusic();
				screen = new MainMenu();
				current = CurrentScreen.MENU;
				b.reset();
			}
		} else if (current == CurrentScreen.GAME) {
			if (!Background.getPaused() && (mouseX > 730 && mouseX < 780 && mouseY > 10 && mouseY < 60)) {
				Background.setPaused(true);
			} else if (Background.getPaused() && (mouseX > 730 && mouseX < 780 && mouseY > 10 && mouseY < 60)) {
				Background.setPaused(false);
			} else if (Background.getPaused() && (mouseX > 265 && mouseX < 535 && mouseY > 10 && mouseY < 45)) {
				screen = new MainMenu();
				current = CurrentScreen.MENU;
			}
		} else if (current == CurrentScreen.INSTRUCTIONS) {
			if (mouseX > 265 && mouseX < 535 && mouseY > 500 && mouseY < 545) {
				screen = new MainMenu();
				current = CurrentScreen.MENU;
			}
		}
	}

	/**
	 * This method when in the game screen will set the boolean variable of the
	 * direction of movement that is entered by the user as true when a "wasd" key
	 * is pressed.
	 */
	public void keyPressed() {
		if (!mouseMode) {
			if (current == CurrentScreen.GAME) {
				if (key == 'a') {
					player.setLeft(true);
				} else if (key == 's') {
					player.setDown(true);
				} else if (key == 'w') {
					player.setUp(true);
				} else if (key == 'd') {
					player.setRight(true);
				}
			}
		}
	}

	/**
	 * This method when in the game screen will set the boolean variable of the
	 * direction of movement that is released by the user as false when a "wasd" key
	 * is released.
	 */
	public void keyReleased() {
		if (current == CurrentScreen.GAME) {
			if (key == 'a') {
				player.setLeft(false);
			} else if (key == 's') {
				player.setDown(false);
			} else if (key == 'w') {
				player.setUp(false);
			} else if (key == 'd') {
				player.setRight(false);
			} else if (key == 'e') {
				player.setLeft(false);
				player.setDown(false);
				player.setUp(false);
				player.setRight(false);

				mouseMode = !mouseMode;
			} else if (key == 'f') {
				music.toggle();
			}

		}
	}

	/**
	 * This method handles all the collisions between the player and the incoming
	 * cars. After being hit it also implements a cool down or invulnerability
	 * period. This method also prevents the player from leaving the road
	 *
	 * @param player the main user.
	 */
	public void collision(Player player) {
		tick++;

		ArrayList<Entity> entities = MainGame.getEntities();
		if (!onCoolDown) {
			for (Entity e : entities) {
				if (e instanceof Player) {
					continue;
				}
				if (player.isPointInside(e.getX(), e.getY()) || player.isPointInside(e.getX() + e.getWidth(), e.getY())
						|| player.isPointInside(e.getX(), e.getY() + e.getHeight())
						|| player.isPointInside(e.getX() + e.getWidth(), e.getY() + e.getHeight())) {
					player.hit();
					onCoolDown = true;
					lastHit = tick;

					if (player.getHealth() <= 0) {
						screen = new GameOver();
						allScores.add((int) GameOver.finalScore());
						current = CurrentScreen.GAMEOVER;
						music.gameOver();
					}

				}
			}
		} else if (tick - lastHit > 100) {
			onCoolDown = false;
//			music.playMusic();
		}
		if (player.getX() < Background.getFirstLineX()) {
			player.setLoc(Background.getFirstLineX(), player.getY());
		}
		if (player.getX() + player.getWidth() > Background.getSecondLineX()) {
			player.setLoc(Background.getSecondLineX() - player.getWidth(), player.getY());
		}
		if (player.getY() < 0) {
			player.setLoc(player.getX(), 0);
		}
		if (player.getY() + player.getHeight() > 600) {
			if (!onCoolDown) {
				onCoolDown = true;
				player.hit();
				lastHit = tick;
				if (player.getHealth() <= 0) {
					screen = new GameOver();
					allScores.add((int) GameOver.finalScore());
					current = CurrentScreen.GAMEOVER;
				}
			} else if (tick - lastHit > 100) {
				onCoolDown = false;

			}
			player.setLoc(player.getX(), 600 - player.getHeight());
		}
	}

	public static boolean getCoolDown() {
		return onCoolDown;
	}

	public static ArrayList<Integer> getScores() {
		return allScores;
	}

}
