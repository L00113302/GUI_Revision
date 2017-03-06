import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class PizzaOrder extends JFrame
  {
   private JPanel jpan1, jpan2, jpan3;
   private JRadioButton jr1, jr2, jr3;
   private JTextField jtex1;
   private JLabel jl1;
   private ImageIcon euroIcon;
   private JCheckBox jchk1, jchk2;
   private ButtonGroup btg;
   private JButton total, euro;
   
   public static void main(String[] args){
   PizzaOrder frame = new PizzaOrder();
   frame.setTitle("Pizza Menu");
   frame.pack();
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setLocationRelativeTo(null);
   frame.setVisible(true);
   }
   
   public PizzaOrder()
   {
   jpan1 = new JPanel(new GridLayout(3,1));
   btg = new ButtonGroup();
   btg.add(jr1);
   btg.add(jr2);
   btg.add(jr3);
   jpan1.add(jr1 = new JRadioButton("Small", true));
   jpan1.add(jr2 = new JRadioButton("Medium"));
   jpan1.add(jr3 = new JRadioButton("Large"));
   btg = new ButtonGroup();
   btg.add(jr1);
   btg.add(jr2);
   btg.add(jr3);

   add(jpan1, BorderLayout.WEST);
   jpan1.setBorder(new TitledBorder("Size"));
   
   total = new JButton("Total", new ImageIcon("image/yoyo.jpg"));
   add(total, BorderLayout.EAST);
   total.setHorizontalTextPosition(JButton.CENTER);
   total.setVerticalTextPosition(JButton.NORTH);
   total.setFont(new Font("Helvetica", Font.BOLD, 30));
   
   jpan3 = new JPanel(new GridLayout(2,1));
   //setLayout(new GridLayout(2, 1));
   jpan3.add(jchk1 = new JCheckBox("Pepperoni"));
   jpan3.add(jchk2 = new JCheckBox("Anchovies"));
   add(jpan3, BorderLayout.CENTER);
   jpan3.setBorder(new TitledBorder("Extras"));
   
      
   jpan2 = new JPanel();
   jpan2.add(jl1 = new JLabel("Your Price:"));
   jpan2.add(jtex1 = new JTextField(""));
   jtex1.setColumns(10);
   jtex1.setBorder( new LineBorder(Color.BLACK, 2));
   add(jpan2, BorderLayout.SOUTH);
   
   ListenerClass listener = new ListenerClass();
   jr1.addActionListener(listener);
   jr2.addActionListener(listener);
   jr3.addActionListener(listener);
   jchk1.addActionListener(listener);
   jchk2.addActionListener(listener);
   }
   
   
   
   private class ListenerClass implements ActionListener
   {
      private double price=0.0;

      public void actionPerformed (ActionEvent e)
      {
      if(jr1.isSelected()) 
      price +=5;
      
      else if(jr2.isSelected())
      price +=7;
      
      else if(jr3.isSelected())
      price +=10;
      
      if(jchk1.isSelected())
      price += 2;
      
      if(jchk2.isSelected())
      price += 2;
      
         
      jtex1.setText(" " +price);
      price=0;
      }   
  
   } 
}   
   


