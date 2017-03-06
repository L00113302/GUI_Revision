import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.BorderLayout;
import java.awt.event.*;


public class ToolbarMenu extends JFrame
{
   // JToolbar
   private JToolBar jtb1;
   private JButton jb1, jb2, jb3, jb4;
   
   // JMenu
   private JMenuBar jmb1;
   private JMenu jm1, jm2;
   private JMenuItem jmi1, jmi2, jmi3, jmi4;
   
   
   public ToolbarMenu()
   {
      jtb1=new JToolBar();
     
   
      jtb1.add(jb1 = new JButton (new ImageIcon("image/cut.jpg")));
      jtb1.add(jb1 = new JButton ("Blue"));
      jtb1.add(jb1 = new JButton ("Blue"));
             
      this.add(jtb1, BorderLayout.NORTH);

      
   }


/*
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
}  */ 


  public static void main(String[] args)
   {
      ToolbarMenu frame = new ToolbarMenu();
      
      frame.setTitle("Data Entry");
      
      frame.setSize(300, 250);
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.setLocationRelativeTo(null);
      
      frame.setVisible(true);
      
      ;
   
   }

 }     