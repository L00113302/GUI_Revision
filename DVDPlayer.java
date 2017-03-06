import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;


public class DVDPlayer extends JFrame
{
   private JPanel jpan1, jpan2;
   private JButton jbut1, jbut2, jbut3, jbut4, jbut5;
   private JTextField jtex1;

   public static void main(String[] args){
   DVDPlayer frame = new DVDPlayer();
   frame.setTitle("DVD Player");
   frame.pack();
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setLocationRelativeTo(null);
   frame.setVisible(true);
   }

   
   public DVDPlayer()
   {
   jpan1 = new JPanel();
   jpan1.add(jbut1=new JButton("Play"));
   jpan1.add(jbut2=new JButton("<<"));
   jpan1.add(jbut3=new JButton(">>"));
   jpan1.add(jbut4=new JButton("Stop"));
   jpan1.setBorder( new LineBorder(Color.BLACK, 2));
   add(jpan1, BorderLayout.EAST);
   
   
   
   jpan2 = new JPanel();
   jpan2.add(jtex1 =new JTextField("DVD Details To Be Displayed Here"));
   add(jpan2, BorderLayout.WEST);
   add(new JButton("DVD To Be Placed Here"), BorderLayout.NORTH);
   
   }
   
}