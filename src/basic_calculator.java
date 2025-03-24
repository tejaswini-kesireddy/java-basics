import java.util.Scanner;

public class basic_calculator {
	public static void main(String[] args) {
		double num1, num2;
		double result = 0;
		String operation; 
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your first number: ");
		num1 = scanner.nextDouble();

		System.out.print("Which operation (+, - , *, /): ");
		operation = scanner.next();
		
		System.out.print("Enter your second number: ");
		num2 = scanner.nextDouble();
		
		if (operation.equals("+")){
			result = num1 + num2;
			System.out.println("The result is: " + result);
		}
		else if (operation.equals("-")){
			result = num1 - num2;
			System.out.println("The result is: " + result);
		}
		else if (operation.equals("*")){
			result = num1 * num2;
			System.out.println("The result is: " + result);
		}
		else if (operation.equals("/")){
			if (num2 == 0) {
				System.out.println("Error: cannot be divided by zero!");
			} else {
				result = num1 / num2;
				System.out.println("The result is: " + result);
			}
		}
		else {
			System.out.println("Error: invalid operator!");
		}

		scanner.close();
		
	} //End main

} //End class

