import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SecurityDialog1 extends JDialog{
	// Declare Components of our JDialog...
	
	// It has a JPanel with two JLabels...
	private JPanel jpLabels;
	private JLabel jlblUserName, jlblPassword;

	// ...a JPanel with a JTextField and  JPasswordField...
	private JPanel jpTextFields;	
   private JTextField jtfUsername;
   private JPasswordField jtfPassword;

	// ...and a JPanel with two JButtons
	private JPanel jpButtons;	
   private JButton jbtOK, jbtCancel;

   private String userNameEntered, passwordEntered;
	private final String requiredPassword = "LetMeIn";

   public SecurityDialog1(){
	   // Constructor - SetLayout & Add Components here...	
      // Panel 1 - Two JLabels
  		jpLabels = new JPanel(new GridLayout(2, 1));
    	jpLabels.add(jlblUserName=new JLabel("Username"));
		jpLabels.add(jlblPassword=new JLabel("Password"));

	   // Panel 2 - A JTextField and a JPasswordField
      jpTextFields = new JPanel(new GridLayout(2, 1));
      jpTextFields.add(jtfUsername = new JTextField(15));
      jpTextFields.add(jtfPassword= new JPasswordField(15));
		jtfPassword.setEchoChar('+');

	   // Panel32 - Three JButtons
      jpButtons = new JPanel();
      jpButtons.add(jbtOK = new JButton("OK"));
      jpButtons.add(jbtCancel = new JButton("Cancel"));

		// Set up the JFrame
      add(jpLabels, BorderLayout.WEST);
      add(jpTextFields, BorderLayout.CENTER);
      add(jpButtons, BorderLayout.SOUTH);
      
      }
      
      
   public static void main(String[] args){
      SecurityDialog1 frame = new SecurityDialog1();
      frame.setTitle("TextAreaDemo");
      frame.setSize(250,150);	 
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
}
