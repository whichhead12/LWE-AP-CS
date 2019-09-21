package exercises;

public class p1_4 
{
	/*
	 * param bill: total bill excluding tip
	 * param tip: tip in dollars
	 * param count: number of people to divide the bill among
	 * return amount each person pays total (bill + tip)
	 */
	public static double calc_total_per_person(double bill, double tip, int count)
	{
		return (bill + tip) / (double)count;
	}

	/*
     * param bill: bill excluding tip
	 * param count: number of people for division
	 * return total of bill excluding tip each person pays
	 */
	public static double calc_bill_per_person(double bill, int count)
	{
		return bill / (double) count;
	}

    /*
     * param tip: tip in dollars
	 * param count: number of people for division
	 * return total of tip each person pays
	 */
	public static double calc_tip_per_person(double tip, int count)
	{
		return tip / (double) count;
	}
	
	public static void print_data(double bill, double tip, double per_person)
	{
		int people_count = (int)((bill + tip) / per_person);
		System.out.printf("Your bill is $%.2f\n", bill);
		System.out.printf("Your tip is $%.2f\n", tip);
		System.out.printf("Your total cost with tip is $%.2f\n", bill + tip);
		System.out.printf("For a party of %d each person owes $%.2f\n", people_count, per_person);
		System.out.printf("$%.2f is for the bill.\n$%.2f is for the tip.", calc_bill_per_person(bill, people_count), calc_tip_per_person(tip, people_count));
	}
	
	public static void main(String[] args)
	{
		int people_count = 4;
		double bill = 100; // pulled from thin air
		double tip = 0.15 * bill; // 15%
		double per_person = calc_total_per_person(bill, tip, people_count);
		print_data(bill, tip, per_person);
	
		/*JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setTitle("Split bill calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
		JLabel label = new JLabel("For a party of " + people_count + " each person owes " + calc_total_per_person(bill, tip, people_count), null, JLabel.CENTER);
		
		//JTextField text = new JTextField(10);
		
		// add frame components
		frame.add(label);
		//frame.add(text); */
		
		String idk = "Hello";
		idk = idk.replace("H", "h");
		System.out.print(idk);
	}
}
