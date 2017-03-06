import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.BorderLayout;

public class CollegeAddress2 extends JFrame
{

   private JLabel jlab1;
   private JLabel jlab2;
   private JLabel jlab3;
   private JLabel jlab4;
   private JLabel jlab5;
   
   public CollegeAddress2()
   {
      setLayout (new BorderLayout (100, 50));
   
      jlab1 = new JLabel (" Department of computing");
      jlab1.setBorder( new LineBorder(Color.BLACK, 2));
      jlab1.setForeground (Color.BLUE);
      jlab1.setBackground (Color.GREEN);
      jlab1.setOpaque(true);
      add(jlab1, BorderLayout.NORTH);
      jlab2 = new JLabel (" Letterkenny Institude of Technology");
      jlab2.setBorder( new LineBorder(Color.BLACK, 2));
      jlab2.setForeground(Color.RED);
      add(jlab2, BorderLayout.EAST);
      jlab3 = new JLabel (" Letterkenny");
      jlab3.setBorder( new LineBorder(Color.BLACK, 2));
      jlab3.setForeground(Color.RED);
      add(jlab3, BorderLayout.WEST);
      jlab4 = new JLabel (" Co. Donegal");
      jlab4.setBorder( new LineBorder(Color.BLACK, 2)); 
      jlab4.setForeground(Color.BLUE);
      add(jlab4, BorderLayout.SOUTH);
      //jlab5 = new JLabel ("Mark");
      //add(jlab5, BorderLayout.CENTER);
   }
   
   public static void main(String[] args)
   {
      CollegeAddress2 frame = new CollegeAddress2();
      
      frame.setTitle("COLLEGE ADDRESS");
      
      frame.pack();
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.setLocationRelativeTo(null);
      
      frame.setVisible(true);
      
      ;
   
   }

 
}