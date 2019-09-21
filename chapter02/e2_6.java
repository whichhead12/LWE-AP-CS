package exercises;

public class e2_6 // HollePrinter
{

	public static void main(String[] args)
	{
		String hello = "Hello, World!";
		String holle = hello.replace("o", "e").replaceFirst("e", "o");
		System.out.print(holle);
	}

}
