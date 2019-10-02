package lab1;

public class Door 
{
	private boolean open; // state
	private String name;
	
	// constructor
	public Door(String name, boolean open)
	{
		this.name = name;
		this.open = open;
	}
	
	// accessor methods
	public String getName()
	{
		return this.name;
	}
	
	public boolean isOpen()
	{
		return this.open;
	}
	
	public String getState()
	{
		if (this.open)
			return "open";
		else
			return "closed";
	}
	
	// mutator methods
	public void open()
	{
		this.open = true;
	}
	
	public void close()
	{
		this.open = false;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}
