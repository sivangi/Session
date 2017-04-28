package fiftyQuestionSolved;

import java.util.Scanner;

public class InputFromUser {
public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
	      System.out.print("Enter first number: ");
	      int firstNumber = s.nextInt();
	      System.out.print("Enter second number: ");
	      int secondNumber = s.nextInt();
	      int sum = firstNumber + secondNumber;
	      System.out.println("The result of addition was " + sum);
	   }
	
}


