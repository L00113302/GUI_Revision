import javax.swing.*;
import java.awt.event.*;

public class TwoButtonEventDemo extends JFrame{
   // TwoButtonEventDemo has one JPanel and two JButtons
   private JPanel panel;
   private JButton jbtOK, jbtCancel;

   public TwoButtonEventDemo(){
      // Construct two buttons
      jbtOK = new JButton("OK");
      jbtCancel = new JButton("Cancel");

      // Construct panel to hold buttons
      panel = new JPanel();
      panel.add(jbtOK);
      panel.add(jbtCancel);

      // Add panel to the frame
      add(panel);

      // Register listeners
      ListenerClass listener = new ListenerClass();
      jbtOK.addActionListener(listener);
      jbtCancel.addActionListener(listener);
   }

   public static void main(String[] args){
      TwoButtonEventDemo frame = new TwoButtonEventDemo();
      frame.setTitle("Handle Event");
      frame.setSize(200, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
   }

   public class ListenerClass implements ActionListener{
      public void actionPerformed(ActionEvent e){
         System.out.println("The " + e.getActionCommand() + " button "
           + "is clicked at\n  " + new java.util.Date(e.getWhen()));
      }
   }
}