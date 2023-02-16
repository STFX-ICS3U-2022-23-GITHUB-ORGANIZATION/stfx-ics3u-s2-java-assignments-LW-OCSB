package Unit1;

import java.util.Scanner;

public class IncomeTaxBonus {

	public static void main(String[] args)  {
		
		// Variable declarations
		double salary = 0;
		double provTax = 0;
		double fedTax = 0;
		boolean validEntry = false;
		Scanner sc = new Scanner(System.in);
		
		// Prompt user for salary
		System.out.println("ICS3U Income Tax Assignment.\n");
		System.out.println("Enter your annual salary: ");
		
		// Get user salary with error checking
		while (validEntry == false)  {
			
			try {
				salary = sc.nextDouble();
			}
			
			catch (Exception e)  {
				
				System.out.println("Invalid entry, please try again.");
				sc.next();  // gets rid of invalid token, else infinite loop
			}
		}
		
		//provTax = provincialTax(salary);
		//fedTax = federalTax(salary);
		
		System.out.println("Provincial Tax: " + provTax);
		System.out.println("Federal Tax: " + fedTax);
	}	
}
