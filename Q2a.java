import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;


public class Q2a extends JFrame
{
   private JRadioButton jrb1, jrb2, jrb3;
   private JButton jb1;
   private JComboBox jcb1;
   private JPanel jpan1, jpan2;
   
   public Q2a()
   {
   jpan1 = new JPanel (new GridLayout(3,1));
   jpan1.add(jrb1=new JRadioButton("Tea", true));
   jpan1.add(jrb2=new JRadioButton("Coffee"));
   jpan1.add(jrb3=new JRadioButton("Cappiccino"));
   jpan1.setBorder(new TitledBorder("Hot"));
   ButtonGroup btg = new ButtonGroup();
   btg.add(jrb1);
   btg.add(jrb2);
   btg.add(jrb3);
   this.add(jpan1, BorderLayout.WEST);
   
   jpan2 = new JPanel();
   jpan2.setBorder(new TitledBorder("Cold"));
   String[] drinksList={"Coke", "Fanta", "Lilt"};
   jpan2.add(jcb1= new JComboBox(drinksList));
   this.add(jpan2,BorderLayout.EAST);
   
   jb1=new JButton("OK");
   this.add(jb1, BorderLayout.SOUTH);
   
   }
    public static void main(String[] args){
      Q2a frame = new Q2a();
      frame.setTitle("Exam Question");
      frame.pack();	 
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }

}   