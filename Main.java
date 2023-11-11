package Sample;

import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		while(true){
			System.out.print("\nMain Menu\n");
			System.out.print("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n");
			System.out.print("Enter your choice:");
			choice= scanner.nextInt();
			
			switch(choice){
				case 1:
				Addition.addition();
				break;
				
				case 2:
				Subtraction.subtraction();
				break;
				
				case 3:
				Multiplication.multiplication();
				break;
				
				case 4:
				Division.division();
				break;
				
			}
		}
	}
	
	
	
	

	

}
































