import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class TextArea extends JFrame
{
   private JPanel jpan1, jpan2;
   private JTextArea jta1;
   private JButton jlab1;
   private ImageIcon crossIcon;
   private JScrollPane scrollPane;

   public static void main(String[] args)
   {
   TextArea frame = new TextArea();
   frame.setTitle("TextArea Demo");
   frame.pack();
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setLocationRelativeTo(null);
   frame.setVisible(true);
   }

   
   public TextArea()
   {
   //jpan1=new JPanel();
   add(jlab1 = new JButton(crossIcon = new ImageIcon("image\\cross.gif")));
   jlab1.setText("An Icon");
   jlab1.setFont(new Font("Sans Serif", Font.BOLD, 16));
   jlab1.setHorizontalTextPosition(JLabel.CENTER);
   jlab1.setVerticalTextPosition(JLabel.TOP);
   jlab1.setIconTextGap(5);
   
      
   //add(jpan1, BorderLayout.WEST);
   
   jta1 = new JTextArea("Java uses the javax.swing.ImageIcon class to represent an icon. An icon is a fixed size picture; typically it is small and used to decprate components.",5,15);
   jta1.setFont(new Font("Serif", Font.PLAIN, 14));
   jta1.setLineWrap(true);
   jta1.setWrapStyleWord(true);
   scrollPane = new JScrollPane(jta1);
   add(scrollPane, BorderLayout.EAST);
   
   jlab1.addActionListener(new ActionListener()
   {
      public void ActionPerformed(ActionEvent e)
      {
      JOptionPane.showMessageDialogue(null, jta1.getText(), "Information", JOptionPane.INFORMATION_MESSAGE);
      }
   });   

   }
}