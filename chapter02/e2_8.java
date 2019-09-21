package exercises;

import java.awt.*;

public class e2_8 {

	public static void main(String[] args)
	{
		Color orig = new Color(50, 100, 150);
		Color c = orig.brighter();
		System.out.println("Red: " + c.getRed());
		System.out.println("Green: " + c.getGreen());
		System.out.println("Blue: " + c.getBlue());
	}

}
