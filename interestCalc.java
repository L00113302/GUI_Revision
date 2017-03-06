import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;

public class interestCalc extends JFrame
{

   public static void main(String[] args){
   interestCalc frame = new interestCalc();
   frame.setTitle("Interest Calculator");
   frame.pack();
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setLocationRelativeTo(null);
   frame.setVisible(true);
}

   private JPanel jpan1, jpan2;
   private JTextField jf1,jf2,jf3,jf4;
   private JButton jb1;

     
   public interestCalc()
   {
   jpan1 = new JPanel();
   jpan1.setLayout(new GridLayout(4,2));
   
   jpan1.add(new JLabel("Investment Amount"));
   jpan1.add(jf1=new JTextField());
   
   jpan1.add(new JLabel("Years"));
   jpan1.add(jf2=new JTextField());
   
   jpan1.add(new JLabel("Annual Interest Rate"));
   jpan1.add(jf3=new JTextField());

   jpan1.add(new JLabel("Future Value"));
   jpan1.add(jf4=new JTextField());
   jf4.setEditable(false);
   

   add(jpan1, BorderLayout.NORTH);
   
   jpan2 = new JPanel();
   jpan2.setLayout(new BorderLayout());
   
   jpan2.add(jb1 = new JButton("Calculate"), BorderLayout.EAST);
   jb1.setMnemonic('C');
   add(jpan2, BorderLayout.SOUTH);
   
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
   


}