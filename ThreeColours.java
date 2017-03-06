import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class ThreeColours extends JFrame
  {
   private JPanel jpan1, jpan2;
   private JLabel thirteen, number;
   private JButton jb1, jb2, jb3;
   private ImageIcon red, green, blue;
   private ButtonGroup btg;
   
   public static void main(String[] args){
   ThreeColours frame = new ThreeColours();
   frame.setTitle("Three Colours Viewer");
   frame.pack();
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setLocationRelativeTo(null);
   frame.setVisible(true);
   }
   
   public ThreeColours()
   {
   jpan1 = new JPanel();
   jpan1.add(number = new JLabel("Number"),BorderLayout.NORTH);
   number.setHorizontalTextPosition(JButton.CENTER);
   number.setVerticalTextPosition(JButton.NORTH);
   number.setFont(new Font("Gill Sans MT", Font.BOLD, 24));
   
   jpan1.add(thirteen = new JLabel("13"), BorderLayout.SOUTH);
   thirteen.setHorizontalTextPosition(JButton.CENTER);
   thirteen.setVerticalTextPosition(JButton.SOUTH);
   thirteen.setFont(new Font("Gill Sans MT", Font.BOLD, 180));
   add(jpan1, BorderLayout.NORTH);
   

   jpan2 = new JPanel(new GridLayout(1,3));
   jpan2.add(jb1 = new JButton("Red"));
   jpan2.add(jb2 = new JButton("Green"));
   jpan2.add(jb3 = new JButton("Blue"));
   btg = new ButtonGroup();
   btg.add(jb1);
   btg.add(jb2);
   btg.add(jb3);
   add(jpan2, BorderLayout.SOUTH);
   
   }
   }