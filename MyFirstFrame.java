import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class MyFirstFrame extends JFrame
{

   private JLabel jlab;
   private JTextField jtex;
   private JComboBox [] jcom;
   private JButton jbut1;
   private JButton jbut2;
   
     
   public MyFirstFrame()
   {
   setLayout(new FlowLayout (FlowLayout.LEFT));

   jlab = new JLabel ("Enter Data Here.");
   jlab.setBorder( new LineBorder(Color.BLACK, 1));
   add(jlab);
   jtex = new JTextField ("Type Date.");
   add(jtex);
   JComboBox jcom = new JComboBox (new String[]{"Adult", "Child", "Student", "Senior Citizen"});
   add(jcom);
   jbut1 = new JButton ("OK");
   jbut1.setBackground(Color.YELLOW);
   jbut1.setForeground(Color.BLUE);
   add(jbut1);
   jbut2 = new JButton ("Cancel");
   jbut2.setBackground(Color.YELLOW);
   jbut2.setForeground(Color.BLUE);
   add(jbut2);
        }
   
   public static void main(String[] args)
   {
      MyFirstFrame frame = new MyFirstFrame();
      
      frame.setTitle("My First Swing Frame");
      
      frame.setSize(300, 100);
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.setLocationRelativeTo(null);
      
      frame.setVisible(true);
      
      ;

   }
}