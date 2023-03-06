package lessons;

import java.util.Scanner;

public class ChkOddEven {

	public static void main(String[] args) {

		// Variables
		int num = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Program will determine if number is odd or even");
		System.out.println("Enter number: ");
		num = sc.nextInt();

		
		if ( (num%2) == 0 )  {
			System.out.println("Number is even.");
		}
		
		else  {
			System.out.println("Number is odd.");
		}
		
		
		
		
		
	}

}
