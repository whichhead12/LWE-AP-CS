package exercises;

import java.util.Random;

public class e2_12 {

	public static void main(String[] args)
	{
		Random rand = new Random();
		int r = rand.nextInt(995);
		double ret = ((double)r + 1000) / 100;
		System.out.printf("$%.2f", ret);
	}

}
