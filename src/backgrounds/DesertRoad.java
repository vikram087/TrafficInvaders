package backgrounds;

import processing.core.PApplet;

/**
 * Normal Road, except with two lane dividers
 * @author Vikram
 * @version 1.0
 */
public class DesertRoad extends Background
{
	/**
	 * Passes the rgb color value to the superclass constructor
	 */
	public DesertRoad()
	{
		super(194, 178, 128);
	}
	
	/**
	 * Draws the double road
	 * @param s PApplet object
	 */
	public void draw(PApplet s)
	{
		super.draw(s);
	}
	
	/**
	 * Scrolls the screen down
	 * @param s PApplet object
	 */
	public void scroll(PApplet s)
	{	
		super.scroll(s);
			
		for(int i = 0; i <= 6; i++)
		{	
			if(time >= s.height)
			{
				time -= 3 * s.height/20;
			}

			s.fill(255,255,255);
				
			s.rect(2 * s.width/5 - s.width/40, -i * 3 * s.height/20 + time, s.width/40, s.height/20);
			s.rect(3 * s.width/5 - s.width/40, -i * 3 * s.height/20 + time, s.width/40, s.height/20);			
		}
			
		if(runs % 1800 == 0)
		{
			difficulty++;
		}
	}
}
