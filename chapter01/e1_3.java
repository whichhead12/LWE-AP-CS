package exercises;

public class e1_3 {

	public static int product_summation(int n)
	{
		int sum = 1;
		for (int i = 1; i <= n; i++)
		{
			sum *= i;
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
		int prod_sum_ten = product_summation(10);
		System.out.println(prod_sum_ten);
		//System.out.println(1*2*3*4*5*6*7*8*9*10);
	}

}
