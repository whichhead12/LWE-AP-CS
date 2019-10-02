package lab1;

/**
A class to test the Door class.
*/
public class DoorTester
{
	/**
	Tests the methods of the Door class
	@param args not used
	*/
	public static void main(String[] args)
	{
		Door frontDoor = new Door("front", true);
		System.out.println("The front door is " + frontDoor.getState());
		System.out.println("Expected:  open");
		Door doorTwo = new Door("back", false);
		System.out.println("The back door is " + doorTwo.getState());
		System.out.println("Expected:  closed");   
		
		// Use the mutator to change the state variable
		doorTwo.open();
		System.out.println("The " + doorTwo.getName() + " door is " + doorTwo.getState());
		System.out.println("Expected:  open");
		
		// Add code to test the setName mutator here 
	}
}