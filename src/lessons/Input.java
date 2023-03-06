package lessons;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {

		int myInteger = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any integer: ");
		myInteger = sc.nextInt();
		
		System.out.println("You entered: " + myInteger);
	}

}
