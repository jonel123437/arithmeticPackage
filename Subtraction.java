package Sample;

import java.util.*;
public class Subtraction{
	public static void subtraction(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 1st number:");
		int num1= scanner.nextInt();
		System.out.print("Enter 2nd number:");
		int num2= scanner.nextInt();
		
		int answer= num1-num2;
		System.out.print("The subtraction is: "+answer);
		ClearScreen.clearScreen();
	}
}