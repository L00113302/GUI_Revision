import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class CollegeAddress extends JFrame
{

   private JLabel jlab1;
   private JLabel jlab2;
   private JLabel jlab3;
   private JLabel jlab4;
   
   public CollegeAddress()
   {
      setLayout (new GridLayout (2, 2));
   
      jlab1 = new JLabel (" Department of computing");
      jlab1.setBorder( new LineBorder(Color.BLACK, 2));
      jlab1.setForeground (Color.BLUE);
      jlab1.setBackground (Color.GREEN);
      add(jlab1);
      jlab2 = new JLabel (" Letterkenny Institude of Technology");
      jlab2.setBorder( new LineBorder(Color.BLACK, 2));
      jlab2.setForeground(Color.RED);
      add(jlab2);
      jlab3 = new JLabel (" Letterkenny");
      jlab3.setBorder( new LineBorder(Color.BLACK, 2));
      jlab3.setForeground(Color.RED);
      add(jlab3);
      jlab4 = new JLabel (" Co. Donegal");
      jlab4.setBorder( new LineBorder(Color.BLACK, 2)); 
      jlab4.setForeground(Color.BLUE);
      add(jlab4);
   }
   
   public static void main(String[] args)
   {
      CollegeAddress frame = new CollegeAddress();
      
      frame.setTitle("COLLEGE ADDRESS");
      
      frame.setSize(500, 100);
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.setLocationRelativeTo(null);
      
      frame.setVisible(true);
      
      ;
   
   }

 
}