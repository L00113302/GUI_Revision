import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;


public class PizzaOrderer extends JFrame
{
   private JPanel jpan1;
   private JRadioButton jr1, jr2, jr3;
   private JTextField jtex1;
   private JLabel jl1;
   private JCheckBox jchk1, jchk2;
   
   public static void main(String[] args){
   PizzaOrderer frame = new PizzaOrderer();
   frame.setTitle("Pizza Menu");
   frame.pack();
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setLocationRelativeTo(null);
   frame.setVisible(true);
   }
   
   public PizzaOrderer()
   {
   jpan1 = new JPanel();
   //jpan1.setLayout(new BorderLayout());
   jpan1.add(jr1 = new JRadioButton("Small"));
   jpan1.add(jr2 = new JRadioButton("Medium"));
   jpan1.add(jr3 = new JRadioButton("Large"));
   
   add(jpan1, BorderLayout.WEST);
   }

}
