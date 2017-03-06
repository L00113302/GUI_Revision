import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;


public class QAA extends JFrame
{

   public static void main(String[] args){
   QAA frame = new QAA();
   frame.setTitle("Quadratic Algorithm Analysis");
   frame.pack();
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setLocationRelativeTo(null);
   frame.setVisible(true);
}

   private JPanel jpan1, jpan2, jpan3, jpan4;
   private JTextField jtf1, jtf2, jtf3, jtf4, jtf5, jtf6;
   private JButton jb1, jb2, jb3;
   private JComboBox jcBox;
   private JLabel jlbl1, jlbl2, jlbl3, jlbl4, jlbl5, jlbl6;
   
   public QAA()
   {
   jpan1 = new JPanel();
   String[] itemList = {"100","1000","10000","100000"};
   add(jcBox = new JComboBox(itemList));
   add(jpan1, BorderLayout.NORTH);
   
   jpan2 = new JPanel();
   //jpan2.setLayout(new GridLayout(1,3));
  
   
   jpan2.add(jlbl1 = new JLabel("Bubble sort in millisecs"));
   jlbl1.setVerticalTextPosition(JLabel.TOP);
   jpan2.add(jtf1=new JTextField(10));
   
   jpan2.add(jlbl2 = new JLabel("Selection sort in millisecs"));
   jlbl2.setVerticalTextPosition(JLabel.TOP);
   jpan2.add(jtf2=new JTextField(10));
   
   jpan2.add(jlbl3=new JLabel("Insertion sort in millisecs"));
   jlbl3.setHorizontalTextPosition(JLabel.CENTER);
   jlbl3.setVerticalTextPosition(JLabel.TOP);
   jpan2.add(jtf3=new JTextField(10));   
   jpan2.setBorder(new TitledBorder("Sorted Array Analysis"));
   add(jpan2, BorderLayout.WEST);
   
   jpan3 = new JPanel();
   //jpan3.setLayout(new GridLayout(1,3));
   
   jpan3.add(jlbl4 =new JLabel("Bubble sort in millisecs" ));
   jpan3.add(jtf4=new JTextField(10));
   
   jpan3.add(jlbl5 = new JLabel("Selection sort in millisecs"));
   jlbl5.setVerticalTextPosition(SwingConstants.TOP);
   jpan3.add(jtf5=new JTextField(10));
   
   jpan3.add(jlbl6=new JLabel("Insertion sort in millisecs"));
   jpan3.add(jtf6=new JTextField(10));   
   jpan3.setBorder(new TitledBorder("Unsorted Array Analysis"));
   add(jpan3, BorderLayout.EAST);


   jpan4 = new JPanel();
   jpan4.add(jb1=new JButton("BUBBLE"));
   jb1.setMnemonic('B');
   jpan4.add(jb2=new JButton("SELECTION"));
   jb2.setMnemonic('S');
   jpan4.add(jb3=new JButton("INSERTION"));
   jb3.setMnemonic('I');

   add(jpan4, BorderLayout.SOUTH);
   
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