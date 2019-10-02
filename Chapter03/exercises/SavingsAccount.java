package exercises;

public class SavingsAccount // E3.5
{
	private double balance, interest; // interest is a percentage represented as a decimal. 0.1 = 10% interest
	
	public SavingsAccount(double balance, double interest)
	{
		this.balance = balance;
		this.interest = interest;
	}
	
	public void withdraw(double amount)
	{
		this.balance -= amount;
	}
	
	public void deposit(double amount)
	{
		this.balance += amount;
	}
	
	public void addInterest()
	{
		this.balance = this.balance * (1 + this.interest);
	}
	
	public double getBalance()
	{
		return this.balance;
	}
}
