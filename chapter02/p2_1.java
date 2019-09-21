package exercises;

import java.awt.*;

public class p2_1 
{
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle(5, 10, 5, 5);
		System.out.println(r);
		r.translate(5, 0);
		System.out.println(r);
		r.translate(0, 5);
		System.out.println(r);
		r.translate(-5,0);
		System.out.println(r);
	}

}
