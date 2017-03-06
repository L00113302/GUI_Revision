import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.BorderLayout;
import java.awt.event.*;


public class Toolbar extends JFrame
{
   private JToolBar jtb1;
   private JButton jb1, jb2, jb3, jb4;
   private JPanel jp1;
   private JLabel jl1, jl2;
   private JTextField jt1, jt2;
   private JTextArea jta1;
   private JScrollPane scrollPane;
   
   
   public Toolbar()
   {
      jtb1=new JToolBar();
      this.add(jtb1, BorderLayout.NORTH);

   
      jtb1.add(jb1 = new JButton ("Blue"));
      jb1.setBorder( new LineBorder(Color.BLUE, 2));
      jb1.setBackground (Color.BLUE);
      jb1.setFont(new Font("SansSerif", Font.BOLD, 10));
      jb1.setToolTipText("This is blue");
      
      jtb1.add(jb2 = new JButton ("Yellow"));
      jb2.setBorder( new LineBorder(Color.YELLOW, 2));
      jb2.setBackground (Color.YELLOW);
      jb2.setFont(new Font("SansSerif", Font.BOLD, 10));
      jb2.setToolTipText("This is yellow");
      
      jtb1.add(jb3 = new JButton ("Green"));
      jb3.setBorder( new LineBorder(Color.GREEN, 2));
      jb3.setBackground (Color.GREEN);
      jb3.setFont(new Font("SansSerif", Font.BOLD, 10));
      jb3.setToolTipText("This is green");

      jtb1.add(jb4 = new JButton ("Red"));
      jb4.setBorder( new LineBorder(Color.RED, 2));
      jb4.setBackground (Color.RED);
      jb4.setFont(new Font("SansSerif", Font.BOLD, 10));
      jb4.setToolTipText("This is Red");
      
      jp1 = new JPanel(new GridLayout(2,2));
      jp1.add(jl1=new JLabel("NAME:"));
      jp1.add(jt1=new JTextField());
      jp1.add(jl2=new JLabel("ID:"));
      jp1.add(jt2=new JTextField());
      jp1.setBorder(new LineBorder (Color.BLACK,2));
      this.add(jp1, BorderLayout.CENTER);
      
      
      scrollPane = new JScrollPane(jta1 = new JTextArea(8, 24));
      jta1.setLineWrap(true);
      jta1.setWrapStyleWord(true); 
      this.add(scrollPane, BorderLayout.SOUTH);
      
      ListenerClass listener = new ListenerClass();
      jt1.addActionListener(listener);
      jt2.addActionListener(listener);
      jb1.addActionListener(
      new ActionListener()
      {
      public void actionPerformed(ActionEvent e)
      {
      jta1.setForeground(Color.BLUE);
      }
      });

      jb2.addActionListener( new ActionListener()
      {
      public void actionPerformed(ActionEvent e)
      {
      jta1.setForeground(Color.YELLOW);
      }
      });

      jb3.addActionListener(listener);
      }
   
   
   
   private class ListenerClass implements ActionListener
   {

      public void actionPerformed (ActionEvent e)
      {
      if (e.getSource()==jt1)
      {
      jta1.append(jt1.getText()+" ");
      jt2.requestFocus();
      }
      
      else if (e.getSource()==jt2)
      {
      jta1.append(jt2.getText()+" "+("\n"));
      jt1.setText("");
      jt2.setText("");
      jt1.requestFocus();      
      }
            
   }
}   
   
    public static void main(String[] args)
   {
      Toolbar frame = new Toolbar();
      
      frame.setTitle("Data Entry");
      
      frame.setSize(300, 250);
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.setLocationRelativeTo(null);
      
      frame.setVisible(true);
      
      ;
   
   }


}   
