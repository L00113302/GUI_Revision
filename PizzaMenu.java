import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

// PizzaMenu IS-A JPanel ==> Inheritance
public class PizzaMenu extends JPanel{
	// Instance Variables go here (properties of our JFrame)...
	// It has a radioButtonPanel with 3 JRadioButtons, 
	private JPanel radioButtonPanel;
	private JRadioButton smallButton, mediumButton, largeButton;	
	private ButtonGroup btg;

	// a checkBoxPanel with 2 JCheckBoxes, and
	private JPanel checkBoxPanel;
	private JCheckBox pepperoniCheckBox, anchoviesCheckBox;			
	
	// Constructor - SetLayout & Add Components here...
	public PizzaMenu(){
		// Set up radioButtonPanel with GridLayout 3 Rows, 1 Column
 	   radioButtonPanel = new JPanel(new GridLayout(3,1));
		// Add 3 JRadioButtons, and...
		radioButtonPanel.add(smallButton = new JRadioButton("Small", true));
		radioButtonPanel.add(mediumButton = new JRadioButton("Medium"));
		radioButtonPanel.add(largeButton = new JRadioButton("Large"));
		btg = new ButtonGroup();
		btg.add(smallButton);				
		btg.add(mediumButton);				
		btg.add(largeButton);	
		// Put a TitledBorder around it.
		radioButtonPanel.setBorder(new TitledBorder("Size"));		

		// Set up checkBoxPanel	with GridLayout 2 Rows, 1 Column	
		checkBoxPanel = new JPanel(new GridLayout(2,1));		
		// Add 2 JCheckBoxes, and...
		checkBoxPanel.add(pepperoniCheckBox = new JCheckBox("Pepperoni"));		
		checkBoxPanel.add(anchoviesCheckBox = new JCheckBox("Anchovies"));		
		// Put a TitledBorder around it.
		checkBoxPanel.setBorder(new TitledBorder("Extras"));		

		// Set up this JPanel
		this.setLayout(new BorderLayout());		
		this.add(radioButtonPanel, BorderLayout.WEST);		
		this.add(checkBoxPanel, BorderLayout.CENTER);				
	}

	public double getPrice(){
      double price=0.0;	
		// Determine if smallButton OR mediumButton OR largeButton is selected
	   if(smallButton.isSelected() == true)
		   price += 5;
		else if(mediumButton.isSelected() == true)
		   price += 8;
		else if(largeButton.isSelected() == true)
		   price += 10;
					
		// Determine in either or both pepperoniCheckBox or anchoviesCheckBox is selected
		if(pepperoniCheckBox.isSelected())
		   price += 1.50;
		if(anchoviesCheckBox.isSelected())
		   price += 1;			
				
		// Reset the price to 0 for next Total
		return price;
   }
}






















