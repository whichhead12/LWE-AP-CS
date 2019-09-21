package exercises;

public class e2_5
{

	public static void main(String[] args)
	{
		String orig = "Mississippi";
		String res = orig.replace("i", "!").replace("s", "$");
		System.out.print("Original: " + orig + "\nResult: " + res);
	}

}
