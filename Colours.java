import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.BorderLayout;

public class Colours extends JFrame
{

   private JLabel jlab1;
   private JLabel jlab2;
   private JLabel jlab3;
   private JLabel jlab4;
   private JLabel jlab5;
   private JLabel jlab6;
   
   public Colours()
   {
      setLayout (new GridLayout (3, 2));
   
      jlab1 = new JLabel (" black");
      jlab1.setBorder( new LineBorder(Color.YELLOW, 2));
      jlab1.setForeground (Color.BLACK);
      jlab1.setFont(new Font("TimesRoman", Font.BOLD, 20));
      jlab1.setToolTipText("BLACK");
      add(jlab1);
      jlab2 = new JLabel (" blue");
      jlab2.setBorder( new LineBorder(Color.YELLOW, 2));
      jlab2.setForeground(Color.BLUE);
      jlab2.setFont(new Font("TimesRoman", Font.BOLD, 20));
      jlab2.setToolTipText("BLUE");
      add(jlab2);
      jlab3 = new JLabel (" cyan");
      jlab3.setBorder( new LineBorder(Color.YELLOW, 2));
      jlab3.setForeground(Color.CYAN);
      jlab3.setFont(new Font("TimesRoman", Font.BOLD, 20));
      jlab3.setToolTipText("CYAN");
      add(jlab3);
      jlab4 = new JLabel (" green");
      jlab4.setBorder( new LineBorder(Color.YELLOW, 2)); 
      jlab4.setForeground(Color.GREEN);
      jlab4.setFont(new Font("TimesRoman", Font.BOLD, 20));
      jlab4.setToolTipText("GREEN");
      add(jlab4);
      jlab5 = new JLabel (" magenta");
      jlab5.setBorder(new LineBorder(Color.YELLOW, 2));
      jlab5.setForeground(Color.MAGENTA);
      jlab5.setFont(new Font("TimesRoman", Font.BOLD, 20));
      jlab5.setToolTipText("MAGENTA");
      add(jlab5);
      jlab6 = new JLabel (" orange");
      jlab5.setBorder(new LineBorder(Color.YELLOW, 2));
      jlab6.setForeground(Color.ORANGE);
      jlab6.setFont(new Font("TimesRoman", Font.BOLD, 20));
      jlab6.setToolTipText("ORANGE");
      add(jlab6);
   }
   
   public static void main(String[] args)
   {
      Colours frame = new Colours();
      
      frame.setTitle("COLOURS");
      
      frame.setSize(450, 150);
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.setLocationRelativeTo(null);
      
      frame.setVisible(true);
      
      ;
   
   }

 
}