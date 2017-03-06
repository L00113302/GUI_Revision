import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.*; // 1+2+3 import ActionListener & ActionEvent
 // 1. Implement the ActionListener interface 
public class SimpleEventDemo extends JFrame implements ActionListener{
   // SimpleEventDemo has one JButton called jbtPressMe
   private JButton jbtPressMe;

   public SimpleEventDemo(){
      // Construct jbtPressMe and...
      jbtPressMe = new JButton("Press Me!");
      // add it to the frame..
      add(jbtPressMe);
      // 2. Indicate that this class will handle the button click 
      jbtPressMe.addActionListener(this); 
   }
   // 3. This is the event handling method for jbtPressMe 
   public void actionPerformed(ActionEvent e){ 
      System.out.println("That felt good!"); 
   } 
   public static void main(String[] args) {
      SimpleEventDemo frame = new SimpleEventDemo();
      frame.setTitle("Event Handler Example");
      frame.setSize(250, 150);
		frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}