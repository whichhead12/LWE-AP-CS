package exercises;

public class e1_2 
{
	public static int summation(int n)
	{
		int sum = 0;
		for (int i = 1; i <= n; i++)
		{
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		int sum_ten = summation(10);
		System.out.println(sum_ten);
		//System.out.println(1+2+3+4+5+6+7+8+9+10);
	}
}
