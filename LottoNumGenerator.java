// Mark Glenn
// L00113302
// CA1 GUI
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JScrollPane;
import java.util.*;

public class LottoNumGenerator extends JFrame
{
   // instance variables
   private JPanel jpan1, jpan2;
   private JButton jbut1, jbut2;
   private JLabel jl1, jl2, jl3, jl4, jl5, jl6;
   private ImageIcon lotto1, lotto2;
   
   // frame
   public static void main(String[] args)
   {
      LottoNumGenerator frame = new LottoNumGenerator();
      frame.setTitle("The Lotto");
      frame.pack();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }

   // construct panels
   public LottoNumGenerator()
   {
      jpan1 = new JPanel();
      jpan1.setLayout(new GridLayout(2, 1));
      jbut1 = new JButton("Quick Pick", new ImageIcon("image/Lotto.png"));
      jbut1.setMnemonic('Q');
      jbut1.setBackground(Color.WHITE);
      jbut1.setToolTipText("Random Quick Pick");
      jbut1.setHorizontalTextPosition(JButton.CENTER);
      jbut1.setVerticalTextPosition(JButton.TOP);
      jbut1.setFont(new Font("Gill Sans MT", Font.BOLD, 20));
   
      jpan1.add(jbut1);
   
      jbut2 = new JButton("Reset Numbers", new ImageIcon("image/Lotto.png"));
      jbut2.setToolTipText("Reset Lotto Numbers to 0");
      jbut2.setMnemonic('R');
      jbut2.setBackground(Color.WHITE);
      jbut2.setHorizontalTextPosition(JButton.CENTER);
      jbut2.setVerticalTextPosition(JButton.NORTH);
      jbut2.setFont(new Font("Gill Sans MT", Font.BOLD, 20));
      jpan1.setBorder(new LineBorder(Color.BLACK, 2));
      jpan1.add(jbut2);
   
      add(jpan1, BorderLayout.WEST);
   
      jpan2 = new JPanel();
      jpan2.setLayout(new GridLayout(6, 1));
      jpan2.add(jl1 = new JLabel("0"));
      jl1.setFont(new Font("Trebuchet MS", Font.BOLD,28));
      jl1.setBorder(new LineBorder(Color.BLACK, 1));
      jpan2.add(jl2 = new JLabel("0"));
      jl2.setFont(new Font("Trebuchet MS", Font.BOLD,28));
      jl2.setBorder(new LineBorder(Color.BLACK, 1));
      jpan2.add(jl3 = new JLabel("0"));
      jl3.setFont(new Font("Trebuchet MS", Font.BOLD,28));
      jl3.setBorder(new LineBorder(Color.BLACK, 1));
      jpan2.add(jl4 = new JLabel("0"));
      jl4.setFont(new Font("Trebuchet MS", Font.BOLD,28));
      jl4.setBorder(new LineBorder(Color.BLACK, 1));
      jpan2.add(jl5 = new JLabel("0"));
      jl5.setFont(new Font("Trebuchet MS", Font.BOLD,28));
      jl5.setBorder(new LineBorder(Color.BLACK, 1));
      jpan2.add(jl6 = new JLabel("0"));
      jl6.setFont(new Font("Trebuchet MS", Font.BOLD,28));
      jl6.setBorder(new LineBorder(Color.BLACK, 1));
   
      add(jpan2, BorderLayout.EAST);
   
      ListenerClass listener = new ListenerClass();
      jbut1.addActionListener(listener);
      jbut2.addActionListener(listener);
   
   }
   private class ListenerClass implements ActionListener
   {
        
      public void actionPerformed(ActionEvent e)
      {
         Random randomObj = new Random();
         int RandomInt1 = randomObj.nextInt(47);
         int RandomInt2 = randomObj.nextInt(47);
         int RandomInt3 = randomObj.nextInt(47);
         int RandomInt4 = randomObj.nextInt(47);
         int RandomInt5 = randomObj.nextInt(47);
         int RandomInt6 = randomObj.nextInt(47);




         if(e.getSource()==jbut1)
         {
            jl1.setText(" "+RandomInt1);
            jl2.setText(" "+RandomInt2);
            jl3.setText(" "+RandomInt3);
            jl4.setText(" "+RandomInt4);
            jl5.setText(" "+RandomInt5);
            jl6.setText(" "+RandomInt6);
         }
      
         if(e.getSource()==jbut2)
         {
            jl1.setText("0");
            jl2.setText("0");
            jl3.setText("0");
            jl4.setText("0");
            jl5.setText("0");
            jl6.setText("0");
         
         }   
      
      }
   
   }   
}


