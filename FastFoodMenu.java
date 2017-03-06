import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
					
// FastFoodMenu IS-A JPanel ==> Inheritance
public class FastFoodMenu extends JPanel{
	// Instance Variables go here (properties of our JFrame)...
	// PANEL 1	
	private JPanel checkBoxPanel1;
	private JCheckBox chipsCheckBox, wedgesCheckBox;			
					
	// PANEL 2	
	private JPanel checkBoxPanel2;
	private JCheckBox burgerCheckBox, cheeseBurgerCheckBox, chickenBurgerCheckBox;							
					
	// PANEL 3
	private JPanel checkBoxPanel3;
	private JCheckBox cokeCheckBox, spriteCheckBox, fantaCheckBox;
					
	// Constructor - SetLayout & Add Components here...
	public FastFoodMenu(){
      // JFrame defaults to BorderLayout
							
		// Set up PANEL 1
		checkBoxPanel1 = new JPanel();
		checkBoxPanel1.setLayout(new GridLayout(2,1));		
		checkBoxPanel1.add(chipsCheckBox = new JCheckBox("Chips"));		
		checkBoxPanel1.add(wedgesCheckBox = new JCheckBox("Wedges"));	
		checkBoxPanel1.setBorder(new TitledBorder(new EtchedBorder(), "Fries"));
								
		// Set up PANEL 2
		checkBoxPanel2 = new JPanel();
		checkBoxPanel2.setLayout(new GridLayout(3,1));		
		checkBoxPanel2.add(burgerCheckBox  = new JCheckBox("Regular Burger"));		
		checkBoxPanel2.add(cheeseBurgerCheckBox  = new JCheckBox("Cheese Burger"));		
		checkBoxPanel2.add(chickenBurgerCheckBox = new JCheckBox("Chicken Burger"));
		checkBoxPanel2.setBorder(new TitledBorder(new EtchedBorder(), "Burgers"));						
							
		// Set up PANEL 3
		checkBoxPanel3 = new JPanel();
		checkBoxPanel3.setLayout(new GridLayout(3,1));		
		checkBoxPanel3.add(cokeCheckBox = new JCheckBox("Coke"));		
		checkBoxPanel3.add(spriteCheckBox = new JCheckBox("Sprite"));		
		checkBoxPanel3.add(fantaCheckBox = new JCheckBox("Fanta"));		
		checkBoxPanel3.setBorder(new TitledBorder(new EtchedBorder(), "Drinks"));				
					
		// Set up Panel
		setLayout(new BorderLayout());		
		add(checkBoxPanel1, BorderLayout.WEST);		
		add(checkBoxPanel2, BorderLayout.CENTER);
		add(checkBoxPanel3, BorderLayout.EAST);								
	}
						
	public double getPrice(){
	    double price=0.0;	
		 if(chipsCheckBox.isSelected())
			 price += 2.00;
		 if(wedgesCheckBox.isSelected())
			 price += 2.00;			
					
		 if(burgerCheckBox.isSelected())
			 price += 2.00;
		 if(cheeseBurgerCheckBox.isSelected())
			 price += 2.50;			
		 if(chickenBurgerCheckBox.isSelected())
			 price += 4.00;
				
		 if(cokeCheckBox.isSelected())
			 price += 1.50;
		 if(spriteCheckBox.isSelected())
			 price += 1.50;			
		 if(fantaCheckBox.isSelected())
			 price += 1.50;

	 	 // Return price
		 return price;
	}
}