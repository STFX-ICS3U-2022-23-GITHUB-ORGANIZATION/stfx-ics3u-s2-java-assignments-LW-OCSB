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
		
		provTax = provincialTax(salary);
		//fedTax = federalTax(salary);
		
		System.out.println("Provincial Tax: " + provTax);
		System.out.println("Federal Tax: " + fedTax);
	}	
	
	
	
	public static double provincialTax(double s)  {
	
		double tax = 0;
		final double PROV_BRACKET_1 = 0.15;  // $53,359 or less
		final double PROV_BRACKET_2 = 0.205; // over $53,359 up to $106,717
		final double PROV_BRACKET_3 = 0.26;  // over $106,717 up to $165,430
		final double PROV_BRACKET_4 = 0.29;  // over $165,430 up to $235,675
		final double PROV_BRACKET_5 = 0.33;  // over $235,675
		
		if (s > 235675)  {
		
			tax = (s - 235675) * PROV_BRACKET_5
					+ (235675 - 165430) * PROV_BRACKET_4
					+ (165430 - 106717) * PROV_BRACKET_3
					+ (106717 - 53359) * PROV_BRACKET_2
					+ 53359 * PROV_BRACKET_1;
		}
		
		else if ( (s > 165430) && (s <= 235675) )  {
			
			tax = (s - 165430) * PROV_BRACKET_4
					+ (165430 - 106717) * PROV_BRACKET_3
					+ (106717 - 53359) * PROV_BRACKET_2
					+ 53359 * PROV_BRACKET_1;
		}
		
		else if ( (s > 106717) && (s <= 165430) )  {
			
			tax = (s - 106717) * PROV_BRACKET_3
					+ (106717 - 53359) * PROV_BRACKET_2
					+ 53359 * PROV_BRACKET_1;
		}
		
		else if ( (s > 53359) && (s <= 106717) )  {
			
			tax = (s - 53359) * PROV_BRACKET_2
					+ 53359 * PROV_BRACKET_1;
		}
		
		else  {  
			tax = (53359 - s) * PROV_BRACKET_1;
		}
		
		return tax;
	}
	

	public static double federalTax(double s)  {
	
		double tax = 0;
		final double FED_BRACKET_1 = 0.0505;  // $49,231 or less
		final double FED_BRACKET_2 = 0.0915;  // over $49,231 up to $98,463
		final double FED_BRACKET_3 = 0.1116;  // over $98,463 up to $150,000
		final double FED_BRACKET_4 = 0.1216;  // over $150,000 up to $220,000
		final double FED_BRACKET_5 = 0.1316;  // over $220,000
		
		if (s > 220000)  {
			
			// code
		}
		
		
		else if ( (s > 150000) && (s <= 220000) )  {
			
			// code
		}
		
		else if ( (s > 98463) && (s <= 150000) )  {
			
			// code
		}
		
		else if ( (s > 49231) && (s <= 98463) )  {
			
			// code
		}
		
		else  {  
			
			// code 
		}
		
		
		return tax;
	}

}
