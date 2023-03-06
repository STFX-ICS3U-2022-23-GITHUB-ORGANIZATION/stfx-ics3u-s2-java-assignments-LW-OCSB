package lessons;

public class Conditions {

	public static void main(String[] args) {
		
		// This will always execute
		if (true) {
			System.out.println("Hello World!");
		}
		
		// This will never execute
		if (false) {
			System.out.println("Goodbye!");
		}
	
		// Conditions
		// Greater than
		if (5 > 1)  {
			System.out.println("5 is bigger than 1");
		}
	
		// Greater or equal to
		if (5 >= 5) {
			System.out.println("Code executed.");
		}
	
		// Less than
		if (1 < 3)  {
			System.out.println("Code2 executed.");
		}
		
		// Less than or equal to
		if (5 <= 5) {
			System.out.println("Code3 executed.");
		}
		
		// Comparison operator
		if (13 == 13)  {
			System.out.println("Code4 executed.");
		}
		
		// Not operator
		if (13 != 13)  {
			System.out.println("Code5 executed.");
		}
		
		
	}

}
