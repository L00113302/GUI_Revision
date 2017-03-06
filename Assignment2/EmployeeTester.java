// Class: Object Oriented GUI Programming
// Description: A EmployeeTester class, to create and run Employee class
// Date: 14/03/2013
// Author: Maria Boyle
import java.util.*;
import javax.swing.*;

public class EmployeeTester{
	public static void main(String args[]){
		// Declare an Array of 5 Employees called employees
		final int NUMBER_OF_EMPLOYEES = 5;
		Employee[] employees = new Employee[NUMBER_OF_EMPLOYEES];
     
		// Create 5 new Employee objects with initial values...
	   Employee e1 = new Employee("Patrick Doyle", "Computer Programmer", 45000);
	   Employee e2 = new Employee("Dylan Sweeney", "Project Manager", 40000);
	   Employee e3 = new Employee("Louise Coyle", "Software Tester", 35000);
	   Employee e4 = new Employee("Mark White", "Security Analyst", 42000);
	   Employee e5 = new Employee("Emma Logan", "Database Administrator", 32000);

		//...and add them to the array called employees
		employees[0]=e1;
		employees[1]=e2;
		employees[2]=e3;
		employees[3]=e4;
		employees[4]=e5;

      frame f1 = new EmployeeFrame();
		JOptionPane.showInputDialog(null, "Choose an Employee", "EMPLOYEES",
										  JOptionPane.INFORMATION_MESSAGE,  new ImageIcon("pramerica.jpg"), employees, employees[0]);


		// CONSTRUCT a EmployeeFrame object called frame, passing the selected Employee into the constrctor
			//EmployeeFrame frame = new EmployeeFrame(returnedValue);
				
		// Set up the frame object
		frame.setTitle("EMPLOYEE OPTIONS");
		frame.setSize(950,620);	
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);					
		frame.setVisible(true);
	}
}