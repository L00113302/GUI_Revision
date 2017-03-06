import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public EventHandlingRevision
{
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
      
      // if statements
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
   
      // button press event
      if(e.getActionCommand().equals("Red"))	// OR e.getSource()==jbtRed
			   jlblNumber.setForeground(Color.RED);
			else if(e.getActionCommand().equals("Green"))
			   jlblNumber.setForeground(Color.GREEN);
			else if(e.getActionCommand().equals("Blue"))
			   jlblNumber.setForeground(Color.BLUE);

      // interest calculator
       ListenerClass listener = new ListenerClass();
    jb1.addActionListener(listener);
 

   }
   private class ListenerClass implements ActionListener
   {
   public void actionPerformed(ActionEvent e)
   {
   double invAmnt=Double.valueOf(jf1.getText());
   int years=Integer.valueOf(jf2.getText());
   double intRate=Double.valueOf(jf3.getText());
        
   double  futVal=invAmnt+(invAmnt*(intRate/100)*years);
   jf4.setText(" "+futVal);
   } 









}