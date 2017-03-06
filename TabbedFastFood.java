import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
							
public class TabbedFastFood extends JFrame{
	// Declare a JTabbedPane object - jtpFastFoodTabs
   private JTabbedPane jtpFastFoodTabs;
								
	// Declare two JPanel objects
   private PizzaMenu pizzaPanel;
   private FastFoodMenu fastFoodPanel;	

	// Declare JButton & Font
	private JButton jbtTotal;
			
	// Declare JPanel for price
	private JPanel pricePanel;
	private JLabel priceLabel;
	private JTextField priceTextField;	

   public TabbedFastFood(){
	   // Set up jtpAccounts
      jtpFastFoodTabs = new JTabbedPane();
									 
	   // Construct and add pizzaPanel
		pizzaPanel = new PizzaMenu();
		jtpFastFoodTabs.add(pizzaPanel, "Pizza");
	   jtpFastFoodTabs.setToolTipTextAt(0, "Pizza");

	   // Construct and add fastFoodPanel
		fastFoodPanel = new FastFoodMenu();
		jtpFastFoodTabs.add(fastFoodPanel, "Fast Food");
	   jtpFastFoodTabs.setToolTipTextAt(1, "Fast Food");

		// Set up jbtTotal JButton
		jbtTotal = new JButton("TOTAL", new ImageIcon("image/euro.jpg"));
 	   jbtTotal.setFont(new Font("Helvetica", Font.BOLD, 30));
		jbtTotal.setMnemonic('T');
      jbtTotal.setHorizontalTextPosition(JButton.CENTER);
      jbtTotal.setVerticalTextPosition(JButton.TOP);
		jbtTotal.setBackground(Color.LIGHT_GRAY);		

	   // Set up pricePanel
 	   pricePanel = new JPanel();
		pricePanel.add(priceLabel = new JLabel("Your Price:"));		
		pricePanel.add(priceTextField = new JTextField(10));

		// Set up JFrame
		add(jtpFastFoodTabs, BorderLayout.CENTER);
		add(jbtTotal, BorderLayout.EAST);
		add(pricePanel, BorderLayout.SOUTH);				
	
		ListenerClass listener = new ListenerClass();
		jbtTotal.addActionListener(listener);
		priceTextField.addActionListener(listener);
	}
							
	public static void main(String[] args){
	   TabbedFastFood frame = new TabbedFastFood();
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setTitle("Fast Food System");
	   frame.pack();
	   frame.setLocationRelativeTo(null);
	   frame.setVisible(true);
	}

	private class ListenerClass implements ActionListener{
      public void actionPerformed(ActionEvent e){
			// Determine which tab is selected
  		   if(jtpFastFoodTabs.getSelectedIndex() == 0)
				priceTextField.setText("" + pizzaPanel.getPrice());
 			else if(jtpFastFoodTabs.getSelectedIndex() == 1)
				priceTextField.setText("" + fastFoodPanel.getPrice());
			
			// If you want to setText() in priceTextField to both tabs added together use...
			//	priceTextField.setText("" + (fastFoodPanel.getPrice()+ pizzaPanel.getPrice()));
		}
	}
}















