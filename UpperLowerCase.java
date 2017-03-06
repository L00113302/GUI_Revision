import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;

public class UpperLowerCase extends JFrame
{

   public static void main(String[] args){
   UpperLowerCase frame = new UpperLowerCase();
   frame.setTitle("Upper or Lower Case");
   frame.pack();
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setLocationRelativeTo(null);
   frame.setVisible(true);
}

   private JPanel jpan2;
   private JTextField jtf1;
   private JButton jb1, jb2;
   
   public UpperLowerCase()
   {
   add(jtf1=new JTextField("Enter text here"), BorderLayout.NORTH);
   
   jpan2 = new JPanel();
   jpan2.add(jb1=new JButton("UPPERCASE"));
   jb1.setMnemonic('U');
   jpan2.add(jb2=new JButton("LOWERCASE"));
   jb2.setMnemonic('L');
   
   add(jpan2, BorderLayout.SOUTH);
   
    ListenerClass listener = new ListenerClass();
    jb1.addActionListener(listener);
    jb2.addActionListener(listener);

   }
   
   private class ListenerClass implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
      //System.out.print("jdhfsh");
      if(e.getActionCommand().equals("UPPERCASE"))
      {
      System.out.print("This is uppercase");
      jtf1.setText(jtf1.getText().toUpperCase());
      }
      else if(e.getActionCommand().equals("LOWERCASE"))
      {
      System.out.print("This is lowercase");
      jtf1.setText(jtf1.getText().toLowerCase());
      }
      }
   }
}   