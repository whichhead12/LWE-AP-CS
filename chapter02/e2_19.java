package exercises;

import javax.swing.JFrame;

public class e2_19 // NameViewer
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		
		NameComponent comp = new NameComponent();
		frame.add(comp);
		frame.setLocationRelativeTo(comp);
		
		frame.setVisible(true);
	}

}