import java.util.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JScrollPane;
import java.util.*;

// Class to model Employee objects
// Employee IS-A Person ==> Inherit from Person
public class Employee extends Person{
	// Instance Variables
	private int employeeNumber;
	private String jobDescription;
	private double salary;
	
	private static int nextUniqueNumber=1;	// Next available unique Employee number
														// static - means nextUniqueNumber is SHARED
														// amongst all Employee objects, so if one
														// of them change it, it is changed for all.

	private final int MAX_SALARY = 100000;
	private final double BONUS_A = 0.02;
	private final double BONUS_B = 0.05;
	private final double BONUS_C = 0.08;	
	private final double TAX_A = 0.2;
	private final double TAX_B = 0.41;
	private final double HI_TAX_BAND = 36000.00;	
	
	// Constructor 1
	public Employee(){
		// Set employeeNumber to nextUniqueNumber, then increment it for next Employee
		this.employeeNumber=nextUniqueNumber++;
		this.jobDescription=new String();
		this.salary=0.0;
	}

	// Constructor 2
	public Employee(String name, String jobDescription, int salary){
		super(name);
		// Set employeeNumber to nextUniqueNumber, then increment it for next Employee
		this.employeeNumber=nextUniqueNumber++;		
		this.jobDescription=jobDescription;
		if(salary <= MAX_SALARY)
			this.salary=salary;
		else
		   salary = MAX_SALARY;
	}

	// getJobDescription() method
	public String getJobDescription(){
	   return jobDescription;
	}

	// getSalary() method
	public double getSalary(){
	   return salary;
	}
	
	// toString() method
	public String toString(){
	   return "EMPLOYEE NUMBER " + employeeNumber + " => " + super.toString() + ", " + jobDescription + " , SALARY :" + salary;
	}
			
	// equals() method
	public boolean equals(Employee employeeIn){
	   if(employeeNumber == employeeIn.employeeNumber &&
		   super.equals(employeeIn))
			return true;
		else
		   return false;
	}
	
	// increaseSalary() method	
	public String increaseSalary(double newSalary){
		String returnMessage = "";
		
		if(newSalary > salary && newSalary <= MAX_SALARY){
		   salary = newSalary;
			returnMessage = "Salary changed to " + newSalary;
		}
		else if(newSalary > MAX_SALARY)
			returnMessage = newSalary + " exceeds allowable salary.";		
		else if(newSalary <= salary)
			returnMessage = newSalary + " must be greater than " + salary;		
		
		// return message to indicate salary changed or an error occurred
		return returnMessage;
	}

	// addBonus() method	
	public double addBonus(int bonusPercentage){
	   switch(bonusPercentage){
		   case 2:salary += (salary * BONUS_A);break;
		   case 5:salary += (salary * BONUS_B);break;
		   case 8:salary += (salary * BONUS_C);break;
			default:JOptionPane.showMessageDialog(null, "Please select 2, 5 or 8","Error", JOptionPane.ERROR_MESSAGE);
         
    		}
		if(salary > MAX_SALARY)
		   salary = MAX_SALARY;
         return salary;
	}

	// calculateMonthlyWage() method	
	public double calculateMonthlyWage(){
	   double wage = salary /12;
		
		if(salary >= HI_TAX_BAND)
		   wage -= (wage * TAX_B);
		else
		   wage -= (wage * TAX_A);
      		
		return wage;
	}	
}