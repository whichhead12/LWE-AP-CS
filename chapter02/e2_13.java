package exercises;

import java.awt.*;

public class e2_13 {

	public static void main(String[] args) 
	{
		Point p1 = new Point(3, 4);
		Point p2 = new Point(-3, -4);
		System.out.println("Expected = 10");
		System.out.print("Calculated = " + p1.distance(p2));
	}

}
