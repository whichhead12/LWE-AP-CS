package exercises;

import java.awt.*;
import javax.swing.*;

public class TwoSquareComponent extends JComponent
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.PINK);
		Rectangle r1 = new Rectangle(50,50,50,50);
		g2.fill(r1);
		
		g2.setColor(Color.BLUE);
		Rectangle r2 = new Rectangle(63,63,25,25);
		g2.fill(r2);
	}
}
