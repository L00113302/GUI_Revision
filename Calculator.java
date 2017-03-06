import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator extends JFrame
{
   private JPanel jpan1, jpan2;
   private JButton jbut1, jbut2, jbut3, jbut4;
   private JTextField jtext1, jtext2, jtext3;

   public static void main(String[] args)
   {
   Calculator frame = new Calculator();
   frame.setTitle("Calculator");
   frame.pack();
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setLocationRelativeTo(null);
   frame.setVisible(true);
   }

   
   public Calculator()
   {
   jpan1 = new JPanel();
   jpan1.setLayout(new FlowLayout());
   jpan1.add(jbut1=new JButton("Add"));
   jbut1.setMnemonic('A');
   jpan1.add(jbut2=new JButton("Subtract"));
   jbut2.setMnemonic('S');
   jpan1.add(jbut3=new JButton("Multiply"));
   jbut3.setMnemonic('M');
   jpan1.add(jbut4=new JButton("Divide"));
   jbut4.setMnemonic('D');
   add(jpan1, BorderLayout.SOUTH);
   
   jpan2 = new JPanel();
   jpan2.setLayout(new FlowLayout());
   jpan2.add(new JLabel("Number 1"));
   jpan2.add(jtext1=new JTextField());
   jtext1.setText("10");
   jtext1.setColumns(3);
   jtext1.setHorizontalAlignment(JTextField.RIGHT);
   jpan2.add(new JLabel("Number 2"));
   jpan2.add(jtext2=new JTextField());
   jtext2.setText("10");
   jtext2.setColumns(3);
   jtext2.setHorizontalAlignment(JTextField.RIGHT);
   jpan2.add(new JLabel("Result"));
   jpan2.add(jtext3=new JTextField());
   jtext3.setText("20"); 
   jtext3.setColumns(8);
   jtext3.setHorizontalAlignment(JTextField.RIGHT);
   jtext3.setEditable(false);
   add(jpan2, BorderLayout.NORTH);
   
   ListenerClass listener = new ListenerClass();
   jbut1.addActionListener(listener);
   jbut2.addActionListener(listener);
   jbut3.addActionListener(listener);
   jbut4.addActionListener(listener);

   }
   
   private class ListenerClass implements ActionListener
   {
      public void actionPerformed (ActionEvent e)
      {
      double num1=Double.valueOf(jtext1.getText());
      double num2=Double.valueOf(jtext2.getText());
      double result=0;
      
      if(e.getSource()==jbut1)
      {
         result=num1+num2;
      }
      
      else if(e.getSource()==jbut2)
      {
         result=num1-num2;
      }
      
      else if(e.getSource()==jbut3)
      {
         result=num1*num2;
      }
      
      else if(e.getSource()==jbut4)
      {
         result=num1/num2;
      }
      
      jtext3.setText(" "+result);
      }
   }               
}   