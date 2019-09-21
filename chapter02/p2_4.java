package exercises;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;

public class p2_4
{

   public static void main(String[] args)
   {
      // Construct a frame and show it
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.setVisible(true);
      // Your work goes here:
      //Construct a rectangle and set the frame bounds
      
      Rectangle r = new Rectangle(200, 200, 200, 200);
      frame.setBounds(r);
      
      JOptionPane.showMessageDialog(frame, "Click OK to continue");
      // Your work goes here:
      // Move the rectangle and set the frame bounds again
      r.translate(300, 400);
      frame.setBounds(r);
   }

}
