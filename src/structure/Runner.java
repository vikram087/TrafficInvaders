package structure;

import java.awt.Dimension;
import javax.swing.JFrame;
import processing.awt.PSurfaceAWT;
import processing.core.PApplet;

/**
 * The Runner class runs the entire program. It creates 
 * the game panel and a new game to run.
 * @author Karan Dalal
 * @version 1.0
 *
 */
public class Runner {
	public static void main(String args[]) {
		Game drawing = new Game();
		PApplet.runSketch(new String[] { "" }, drawing);
		PSurfaceAWT surf = (PSurfaceAWT) drawing.getSurface();
		PSurfaceAWT.SmoothCanvas canvas = (PSurfaceAWT.SmoothCanvas) surf.getNative();
		JFrame window = (JFrame) canvas.getFrame();

		window.setSize(400, 300);
		window.setMinimumSize(new Dimension(100, 100));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(true);

		window.setVisible(true);
		canvas.requestFocus();

	}

}
