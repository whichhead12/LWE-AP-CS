package exercises;

import java.awt.*;

public class e2_2  // AreaTester
{
	private static double calc_perim(Rectangle r)
	{
		return (r.getHeight()*2) + (r.getWidth()*2);
	}

	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle(5, 4, 3, 2);
		System.out.println("Perimeter: " + calc_perim(r));
	}

}