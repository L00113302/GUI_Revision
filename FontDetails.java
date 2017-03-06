import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JScrollPane;


public class FontDetails extends JFrame
{
   // instance variables
   private JPanel jpan1, jpan2, jpan3;
   private JComboBox [] jcom1;
   private JComboBox [] jcom2;
   private JCheckBox jchk1, jchk2;
   private JTextArea jta1;
   private JLabel jl1, jl2;
   
    
   // frame
   public static void main(String[] args)
   {
   FontDetails frame = new FontDetails();
   frame.setTitle("Set Font Details");
   frame.pack();
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setLocationRelativeTo(null);
   frame.setVisible(true);
   }
   
   public FontDetails()
   {
   jpan1 = new JPanel();
   jpan1.add(new JLabel("Font Name"));
   JComboBox jcom1 = new JComboBox (new String[]{"Adult", "Child", "Student", "Senior Citizen"});
   jpan1.add(jcom1, BorderLayout.EAST);
   
   jcom2=new JComboBox();
   for(int i = 1; i < 100; i ++)
   {
   jcom2.add(i);
   }
   jpan1.add(jcom2, BorderLayout.EAST);

   add(jpan1, BorderLayout.NORTH);
   
   jpan2 = new JPanel();
   jpan2.add(jta1 = new JTextArea("Welcome to Java"));
   jta1.setColumns(20);
   jta1.setRows(3);
   add(jpan2, BorderLayout.CENTER);

   jpan3 = new JPanel();
   jpan3.add(jchk1 = new JCheckBox("Bold"));
   jchk1.setMnemonic('B');
   jpan3.add(jchk2 = new JCheckBox("Italic"));
   jchk2.setMnemonic('I');

   
   add(jpan3, BorderLayout.SOUTH);
   

   }
}