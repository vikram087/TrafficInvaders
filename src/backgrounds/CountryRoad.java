package backgrounds;

import processing.core.PApplet;

/**
 * Country road background
 * @author Vikram
 * @version 1.0
 */
public class CountryRoad extends Background
{
	/**
	 * Passes the rgb color value to the superclass constructor
	 */
	public CountryRoad()
	{
		super(19,109,21);
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

		s.fill(255,255,255);
		s.rect(s.width/2 - s.width/40 - s.width/80, 0, s.width/40, s.height);

		for(int i = 0; i <= 6; i++)
		{	
			if(time >= s.height)
			{
				time -= 3 * s.height/20;
			}

			s.fill(255,255,255);
				
			s.rect(s.width/2 - s.width/40 + s.width/80, -i * 3 * s.height/20 + time, s.width/40, s.height/20);			
		}
			
		if(runs % 1800 == 0)
		{
			difficulty++;
		}
	}
}
