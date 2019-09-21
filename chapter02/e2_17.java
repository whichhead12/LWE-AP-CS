package exercises;

import javax.swing.JFrame;

public class e2_17 {

	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		
		TwoSquareComponent comp = new TwoSquareComponent();
		frame.add(comp);
		
		frame.setVisible(true);
	}

}
