import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JScrollPane;



// Practical2B_D IS-A JFrame ==> Inheritance
public class Practical3_F extends JFrame{
   // Declare a combo box to hold font names
   private JComboBox jcboFontName = new JComboBox();

   // Declare a combo box to hold font sizes
   private JComboBox jcboFontSize = new JComboBox();

   // Font name
   private String fontName = "SansSerif";

   // Font style
   private int fontStyle = Font.PLAIN;

   // Font Size
   private int fontSize = 12;

   // Declare a panel for displaying message
   private JTextArea jtaMessage = new JTextArea("Welcome to Java", 3, 20);

   // Declare check boxes
   private JCheckBox jchkCentered, jchkBold, jchkItalic;
	
	// Declare JPanels
   JPanel p1, p2, p3, p4;

	// Constructor - SetLayout & Add Components here...
   public Practical3_F(){
      // Find all available font names and populate jcboFontName with them
      GraphicsEnvironment e =
         GraphicsEnvironment.getLocalGraphicsEnvironment();
      String[] fontnames = e.getAvailableFontFamilyNames();
      for(int i = 0; i < fontnames.length; i++)
         jcboFontName.addItem(fontnames[i]);
      jcboFontName.setSelectedItem("" + fontName);
   
      // Add font sizes into jcboFontSize
      for(int i = 1; i <= 100; i++)
         jcboFontSize.addItem("" + i);
      jcboFontSize.setSelectedItem("" + fontSize);
   
   	// Set up p1    
   	// Hold font name label and combo box
      p1 = new JPanel(new BorderLayout(10, 10));
      p1.add(new JLabel("Font Name"), BorderLayout.WEST);
      p1.add(jcboFontName, BorderLayout.CENTER);
   
   	// Set up p2    
      // Hold font size label and combo box
      p2 = new JPanel(new BorderLayout(10, 10));
      p2.add(new JLabel("Font Size"), BorderLayout.WEST);
      p2.add(jcboFontSize, BorderLayout.CENTER);
   
   	// Set up p3 
      // Add p1 and p2 into p3
      p3 = new JPanel(new BorderLayout(10, 10));
      p3.setBorder(new EmptyBorder(10, 10, 10, 10));
      p3.add(p1, BorderLayout.CENTER);
      p3.add(p2, BorderLayout.EAST);
   
   	// Set up p4
      // Put three check boxes in panel p
      p4 = new JPanel();
      p4.add(jchkCentered = new JCheckBox("Centered"));
      p4.add(jchkBold = new JCheckBox("Bold"));
      p4.add(jchkItalic = new JCheckBox("Italic"));
      // Set keyboard mnemonics
      jchkCentered.setMnemonic('C');
      jchkBold.setMnemonic('B');
      jchkItalic.setMnemonic('I');
   
      // Place jtaMmessage, p3, and p4 in the frame
      add(jtaMessage, BorderLayout.CENTER);
      add(p3, BorderLayout.NORTH);
      add(p4, BorderLayout.SOUTH);
      // Set the background color of messagePanel
      jtaMessage.setBackground(Color.yellow);
      jtaMessage.setFont(new Font(fontName, fontStyle, fontSize));
   
   
      ListenerClass listener = new ListenerClass();
      jchkBold.addActionListener(listener);
      jchkItalic.addActionListener(listener);
   } 
   private class ListenerClass implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if(e.getSource()==jchkBold)
         {
            jtaMessage.setFont(new Font(fontName, Font.BOLD, fontSize));
         }
         if(e.getSource()==jchkItalic)
         {
            jtaMessage.setFont(new Font(fontName, Font.ITALIC, fontSize));
         }  
         
          
      }
   }

	// Main method - Construct frame object here...
	// ... and set it up
   public static void main(String[] args){
   	// CONSTRUCT a Practical3_F object called frame
      Practical3_F frame = new Practical3_F();
   	
   	// Do whatever to frame object
   	// Set frame's title to "Set Font Details"
      frame.setTitle("Set Font Details");
   	// Make frame big enough to hold components
      frame.pack();	
   	// Add the Default Close operation to frame
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	// Center the frame
      frame.setLocationRelativeTo(null);
   	// Set frame visible
      frame.setVisible(true);
   }
   
   
   
   
}

