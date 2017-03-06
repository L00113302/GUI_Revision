import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JScrollPane;


public class Revision extends JFrame
{
   // instance variables
   private JPanel jpan1, jpan2;
   private JButton jbut1, jbut2, jbut3, jbut4;
   private JTextField jtext1, jtext2, jtext3;
   private JLabel jlab1, number, thirteen;
   private JCheckBox jchk1;
   private ImageIcon red, green, blue;
   private ButtonGroup btg;
   private JComboBox [] jcom;
   

   // frame
   public static void main(String[] args)
   {
   PizzaOrderer frame = new PizzaOrderer();
   frame.setTitle("Pizza Menu");
   frame.pack();
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setLocationRelativeTo(null);
   frame.setVisible(true);
   }

   // construct panels
   public Revision()
   {
   // row of buttons
   jpan1=new JPanel();
   jpan1.add(jbut1=new JButton("Play"));
   jpan1.add(jbut2=new JButton("<<"));
   jpan1.add(jbut3=new JButton(">>"));
   jpan1.add(jbut4=new JButton("Stop"));
   // set border
   address1.setBorder(new LineBorder(Color.BLACK, 1));
   jpan1.setBorder( new LineBorder(Color.BLACK, 2));
   add(jpan1, BorderLayout.EAST);
   
   // numbers and fonts
   jpan2 = new JPanel();
   jpan2.add(number = new JLabel("Number"),BorderLayout.NORTH);
   number.setHorizontalTextPosition(JButton.CENTER);
   number.setVerticalTextPosition(JButton.NORTH);
   number.setFont(new Font("Gill Sans MT", Font.BOLD, 24));
   jpan2.add(thirteen = new JLabel("13"), BorderLayout.SOUTH);
   thirteen.setHorizontalTextPosition(JButton.CENTER);
   thirteen.setVerticalTextPosition(JButton.SOUTH);
   thirteen.setFont(new Font("Gill Sans MT", Font.BOLD, 180));
   add(jpan1, BorderLayout.NORTH);
   
   // textfields and labels with alignment and column size
   jpan2 = new JPanel();
   jpan2.setLayout(new FlowLayout());
   jpan2.add(new JLabel("Number 1"));
   jpan2.add(jtext1=new JTextField());
   jtext1.setText("10");
   jtext1.setColumns(3);
   jtext1.setHorizontalAlignment(JTextField.RIGHT);
   jpan2.add(new JLabel("Number 2"));
   jpan2.add(jtext2=new JTextField());
   jtext2.setText("10");
   jtext2.setColumns(3);
   jtext2.setHorizontalAlignment(JTextField.RIGHT);
   jpan2.add(new JLabel("Result"));
   jpan2.add(jtext3=new JTextField());
   jtext3.setText("20"); 
   jtext3.setColumns(8);
   jtext3.setHorizontalAlignment(JTextField.RIGHT);
   jtext3.setEditable(false);
   add(jpan2, BorderLayout.NORTH);

   // calculator layout
   jp1 = new JPanel();
      jp1.setLayout (new GridLayout (4, 3));
      
      for (int i=9; i>0; i--)
      {
         numberButtons[i]=new JButton(" " +i);
      }
      
      for (int i=9; i>0; i--)
      {
         jp1.add(numberButtons[i]);
      }
      jp1.add(new JButton(" "+0));
      jp1.add(new JButton(" "+"."));
      jp1.add(new JButton(" "+"CE"));
      add(jp1, BorderLayout.CENTER);
      
      jp2 = new JPanel();
      jp2.setLayout(new FlowLayout());
      jp2.add(jbut1=new JButton("+"));
   
      jp2.add(jbut2=new JButton("-"));
   
      jp2.add(jbut3=new JButton("*"));
   
      jp2.add(jbut4=new JButton("/"));
   
      add(jp2, BorderLayout.SOUTH);
      
      add(jtext1=new JTextField("Answer Goes Here"), BorderLayout.NORTH);
      }
      
   // microwave layout
   p1=new JPanel();
   p1.setlayout(new Gridlayout(4,3));
   for (int i=1; i<=9; i++)
   {
   p1.add(new JButton(" "+i));
   }
   p1.add(new JButton(" "+0);
   p1.add(new JButton("Start");
   p1.add(new JButton("Stop");
   
   p2=new Jpanel()
   p2.setLayout(new BorderLayout());
   p2.add(new JTextField("Time to be Displayed here", BorderLayout.NORTH));
   p2.add(p1, BorderLayout.CENTER);
   add(p2, BorderLayout.EAST);
   add(new JButton("Food to be Placed Here"), BorderLayout.CENTER);
   
   // setForeground of JLabels	
	jlblBlack.setForeground(Color.BLACK);
   // setBorder of JLabels		
	// Construct a Border object called border, passing the Color 				
	Border border = new LineBorder(Color.YELLOW);
   jlblBlack.setBorder(border);
   // setFont of JLabels	
	// Construct a Font object called font, passing the name, style and size of the font 
	Font font = new Font("TimesRoman", Font.BOLD, 20);
	jlblBlack.setFont(font);
   // setToolTipText of JLabels				
   jlblBlack.setToolTipText("black");

   // jcombo box
   JComboBox jcom = new JComboBox (new String[]{"Adult", "Child", "Student", "Senior Citizen"});
   add(jcom);

   // scroll pane
   // JScrollPane containing a...
	private JScrollPane scrollPane;
   // ...JTextArea (for displaying text)
   private JTextArea jtaDescription;
   // construct pane
   String description = "Java uses the javax.swing.ImageIcon class to represent an icon." +
	                        "An icon is a fixed-size picture;" +
				  				   " typically it is small and used to decorate components.";
									
		jtaDescription = new JTextArea(description);
		jtaDescription.setLineWrap(true);
		jtaDescription.setWrapStyleWord(true);
      // Set the font in the textArea
      jtaDescription.setFont(new Font("Serif", Font.PLAIN, 14));
		jtaDescription.setEditable(false);
		// OR
		// jtaDescription = new JTextArea();
      // jtaDescription.setText(description)
      // Create a scroll pane to hold the text area
      scrollPane = new JScrollPane(jtaDescription);
		// Add JLabel and JTextArea to our JFrame		
		// REMEMBER JFrame defaults to BorderLayout		
      add(scrollPane, BorderLayout.CENTER);				
   `}
   
    // add images
    southPanel.add(jbtRed=new JButton("Red", new ImageIcon("image/red-ball.gif")));
    southPanel.add(jbtGreen=new JButton("Green", new ImageIcon("image/green-ball.gif")));				
    southPanel.add(jbtBlue=new JButton("Blue", new ImageIcon("image/blue-ball.gif")));		
    
    }

   // add mnemonics
   jpan2.add(jb1=new JButton("UPPERCASE"));
   jb1.setMnemonic('U');
   jpan2.add(jb2=new JButton("LOWERCASE"));
   jb2.setMnemonic('L');


   // lottonumbers
   private JButton[] lottoNumbers = new JButton[49];

   
    jp1 = new JPanel();
      jp1.setLayout (new GridLayout (7, 7));
      
      for (int i=49; i>1; i--)
      {
         lottoNumbers[i]=new JButton(" " +i);
      }
      
      for (int i=49; i>1; i--)
      {
         jp1.add(numberButtons[i]);
      }
      jp1.add(new JButton(" "+0));
      jp1.add(new JButton(" "+"."));
      jp1.add(new JButton(" "+"CE"));
      add(jp1, BorderLayout.CENTER);
      
      jp2 = new JPanel();
      jp2.setLayout(new FlowLayout());
      jp2.add(jbut1=new JButton("+"));
   
      jp2.add(jbut2=new JButton("-"));
   
      jp2.add(jbut3=new JButton("*"));
   
      jp2.add(jbut4=new JButton("/"));
   
      add(jp2, BorderLayout.SOUTH);
      
      add(jtext1=new JTextField("Answer Goes Here"), BorderLayout.NORTH);
      }
      

   


   }
}