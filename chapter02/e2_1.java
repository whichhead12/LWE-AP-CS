package exercises;

import java.awt.*;

public class e2_1  // AreaTester
{
	private static double calc_area(Rectangle r)
	{
		return r.getHeight() * r.getWidth();
	}

	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle(5, 4, 3, 2);
		System.out.println("Area: " + calc_area(r));
	}

}
