import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calc extends JFrame
{
   private JButton[] numberButtons = new JButton[10];
   private JPanel jp1, jp2;
   private JButton jbut1, jbut2, jbut3, jbut4;
   private JTextField jtext1;  
   
   public static void main(String[] args)
   {
      Calc frame = new Calc();
      frame.setTitle("Calculator");
      frame.setSize(200,200);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }


   
   public Calc()
   {  
      jp1 = new JPanel();
      jp1.setLayout (new GridLayout (4, 3));
      
      for (int i=9; i>0; i--)
      {
         numberButtons[i]=new JButton(" " +i);
      }
      
      for (int i=9; i>0; i--)
      {
         jp1.add(numberButtons[i]);
      }
      jp1.add(new JButton(" "+0));
      jp1.add(new JButton(" "+"."));
      jp1.add(new JButton(" "+"CE"));
      add(jp1, BorderLayout.CENTER);
      
      jp2 = new JPanel();
      jp2.setLayout(new FlowLayout());
      jp2.add(jbut1=new JButton("+"));
   
      jp2.add(jbut2=new JButton("-"));
   
      jp2.add(jbut3=new JButton("*"));
   
      jp2.add(jbut4=new JButton("/"));
   
      add(jp2, BorderLayout.SOUTH);
      
      add(jtext1=new JTextField("Answer Goes Here"), BorderLayout.NORTH);
      
     // ListenerClass listener = new ListenerClass();
      //jbut1.addActionListener(add);
      //jbut2.addActionListener(subtract);
     // jbut3.addActionListener(multiply);
     // jbut4.addActionListener(equals);
   }
       private class ListenerClass implements ActionListener
   {
      public void actionPerformed (ActionEvent e)
      {
     /* double num1=Double.valueOf();
      double num1=Double.valueOf(jtext1.getText());
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
      
      jtex1.setText(" "+result);
      }
   } 
    class add implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        TEMP = Double.parseDouble(jtfResult.getText());
                    jtfResult.setText("");
                    addBool = true ;

    }
}
class subtract implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        TEMP = Double.parseDouble(jtfResult.getText());
        jtfResult.setText("");
        subBool =true;
    }
}
class multiply implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        TEMP = Double.parseDouble(jtfResult.getText());
        jtfResult.setText("");
        mulBool =true;

    }
}
class divide implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        TEMP = Double.parseDouble(jtfResult.getText());
        jtfResult.setText("");
        divBool =true;
    }
}
class equals implements ActionListener {
    public void actionPerformed(ActionEvent e) {
                    SolveTEMP = Double.parseDouble(  jtfResult.getText() );
                    if ( addBool == true  )
                        SolveTEMP = SolveTEMP + TEMP;

                    else if ( subBool == true  )
                        SolveTEMP = SolveTEMP - TEMP;
                    else if ( mulBool == true  )
                        SolveTEMP = SolveTEMP * TEMP;
                    else if ( divBool == true  )
                        SolveTEMP = SolveTEMP / TEMP;
        jtfResult.setText(  Double.toString( SolveTEMP ) );

        addBool = false ;
        subBool = false ;
        mulBool = false ;
        divBool = false ;


    }
}

   }*/
}
}   
   
}