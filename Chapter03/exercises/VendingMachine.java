package exercises;

public class VendingMachine 
{
	private int cans, tokens;
	
	public VendingMachine()
	{
		this.cans = 0;
		this.tokens = 0;
	}
	
	public VendingMachine(int cans)
	{
		this.cans = cans;
		this.tokens = 0;
	}
	
	public void fillUp(int cans)
	{
		this.cans += cans;
	}
	
	public void insertToken()
	{
		this.tokens++;
		this.cans--;
	}
	
	public int getTokenCount()
	{
		return this.tokens;
	}
	
	public int getCanCount()
	{
		return this.cans;
	}
}
