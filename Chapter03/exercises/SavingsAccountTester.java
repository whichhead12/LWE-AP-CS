package exercises;

public class SavingsAccountTester // E3.5
{
	public static void main(String[] args)
	{
		SavingsAccount acc = new SavingsAccount(1000, 0.1);
		acc.addInterest();
		
		System.out.println("Expected value: " + 1000 * 1.1); // 1000 * 1.1 = 1100
		System.out.printf("Calculated: $%.2f\n", acc.getBalance());
		
		acc.deposit(3000);
		acc.withdraw(1000);
		
		double expectedFinal = (1000 * 1.1) + (3000 - 1000); // 1100 + 2000 = 3100
		System.out.println("Expected value: " + expectedFinal);
		System.out.printf("Calculated: $%.2f", acc.getBalance());
		
	}
}
