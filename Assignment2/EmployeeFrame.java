// Mark Glenn
// L00113302
// Cloud & Green
// CA2 GUI
// 13/04/2016

// Import from java library
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JScrollPane;
import java.util.*;

// EmployeeFrame IS-A JFrame ==> Inheritance
public class EmployeeFrame extends JFrame
{

	// Instance Variables
   private Employee currentEmployee;
   private JPanel jPan1, jPan2;
   private JButton jb1, jb2, jb3;
   private ButtonGroup btg;
   private final String REQUIREDPASSWORD = "pramerica";
   private String jtfPassword;
   private JLabel jlblOne;
		
	// Constructor - SetLayout & Add Components here...
	// Constructor takes in the selected employee and assigns it to currentEmployee
   public EmployeeFrame(Employee employeeIn)
   {
      // JPanel containing image and employee details      
      jPan1 = new JPanel();
      //currentEmployee=employeeIn;
      jlblOne = new JLabel(new ImageIcon("building.jpg"), JLabel.CENTER);
      jlblOne.setFont(new Font("Serif Bold", Font.BOLD, 18));
      jlblOne.setForeground (Color.BLUE);
      jlblOne.setBackground (Color.RED);
      jlblOne.setHorizontalTextPosition(JButton.CENTER);
      jlblOne.setVerticalTextPosition(JButton.BOTTOM);
      jPan1.add(jlblOne,BorderLayout.SOUTH);
      add(jPan1, BorderLayout.NORTH);
   
      // JPanel containing buttons for adjusting salary 
      jPan2 = new JPanel(new GridLayout(1,3));
      btg = new ButtonGroup();
      btg.add(jb1);
      btg.add(jb2);
      btg.add(jb3);
      
      // New JButton with image, Mnemonic and tooltip
      jb1 = new JButton("Increase Salary", new ImageIcon("yoyo.jpg"));
      jb1.setMnemonic('I');
      jb1.setToolTipText("Click to increase employees salary");
      jb1.setHorizontalTextPosition(JButton.CENTER);
      jb1.setVerticalTextPosition(JButton.BOTTOM);
      jb1.setFont(new Font("Helvetica", Font.BOLD, 12));
      jPan2.add(jb1);
   
      // Event handling
      /*jb1.addActionListener(
            new ActionListener()
            {
               public void actionPerformed(ActionEvent e)
               {
                  // Increase salary and adjust employee details
                  double salAmount=Double.valueOf(JOptionPane.showInputDialog(null, "Change salary to:", "Input", JOptionPane.QUESTION_MESSAGE));
                  System.out.print(currentEmployee.increaseSalary(salAmount));
                  jlblOne.setText(currentEmployee.toString());
               }
                                
            }); */ 
           
      // New JButton with image, Mnemonic and tooltip
      jb2 = new JButton("Add Bonus", new ImageIcon("yoyo.jpg"));
      jb2.setToolTipText("Click to add bonus to employees salary");
      jb2.setMnemonic('A');
      jb2.setHorizontalTextPosition(JButton.CENTER);
      jb2.setVerticalTextPosition(JButton.BOTTOM);
      jb2.setFont(new Font("Helvetica", Font.BOLD, 12));
      jPan2.add(jb2);
      
      // Event handling
      /*jb2.addActionListener(
            new ActionListener()
            {
               public void actionPerformed(ActionEvent e)
               {
                  // Security password for entry to add bonus
                  jtfPassword=(JOptionPane.showInputDialog(null,"Please enter password","Password", JOptionPane.QUESTION_MESSAGE));
                  
                  if(jtfPassword.equals(REQUIREDPASSWORD))
                  {
                  
                     // Add bonus and adjust employee details
                     int bonusPercentage=Integer.valueOf(JOptionPane.showInputDialog(null, "Select bonus: 2%, 5% or 8%", "Input", JOptionPane.QUESTION_MESSAGE)); 
                     System.out.print(currentEmployee.addBonus(bonusPercentage));
                     jlblOne.setText(currentEmployee.toString());
                  }
                  else
                  {
                     JOptionPane.showMessageDialog(null, "Wrong Password!","Error", JOptionPane.ERROR_MESSAGE);
                  }
               
               }
            }); */ 
   
      // New JButton with image, Mnemonic and tooltip
      jb3 = new JButton("Calculate Monthly Wage", new ImageIcon("yoyo.jpg"));
      jb3.setToolTipText("Click to calculate and print employees monthly wage");
      jb3.setMnemonic('C');
      jb3.setHorizontalTextPosition(JButton.CENTER);
      jb3.setVerticalTextPosition(JButton.BOTTOM);
      jb3.setFont(new Font("Helvetica", Font.BOLD, 12));
      jPan2.add(jb3);
      
      // Event handling
      /*jb3.addActionListener(
            new ActionListener()
            {
               public void actionPerformed(ActionEvent e)
               {
                  // Calculate monthly wage and add to employee details
                  System.out.print(currentEmployee.calculateMonthlyWage());
                  jlblOne.setText(currentEmployee.toString()+" Monthly Wage: " +String.format("%.2f",currentEmployee.calculateMonthlyWage()));
               }
            });  */
      
      add(jPan2, BorderLayout.SOUTH);
   }
} // end program



