package exercises;

import java.awt.*;
import javax.swing.*;

public class NameComponent extends JComponent
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g)
	{
		// blue rectangle
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLUE);
		Rectangle r2 = new Rectangle(75,75,100,100);
		g2.fill(r2);
		
		// my name
		g2.setColor(Color.RED);
		g2.drawString("Ben", 75+40, 75+50);
	}
}