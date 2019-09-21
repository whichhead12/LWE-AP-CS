package exercises;

import java.awt.*;

public class e2_3
{
	private static double calc_area(Rectangle r)
	{
		return r.getHeight() * r.getWidth();
	}
	
	private static double calc_perim(Rectangle r)
	{
		return (r.getHeight()*2) + (r.getWidth()*2);
	}

	public static void main(String[] args) 
	{
		Rectangle one = new Rectangle(15, 10, 6, 7); // area of 42
		Rectangle two = new Rectangle(15, 10, 12, 9); // perimeter of 42
		System.out.println("Area of rectangle one: " + calc_area(one));
		System.out.println("Perimeter of rectangle two: " + calc_perim(two));
	}

}