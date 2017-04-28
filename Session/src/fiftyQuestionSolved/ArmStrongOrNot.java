package fiftyQuestionSolved;

import java.util.Scanner;

public class ArmStrongOrNot {

	public static void main(String arg[]) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number to check whether it is armstrong or not:");
		int n = s.nextInt();
		int digit, sum = 0, temp = n;
		while (n > 0) {
			digit = n % 10;
			n = n / 10;
			sum = sum + (digit * digit * digit);
		}
		if (sum == temp)
			System.out.print("Given number " + temp + " is Armstrong");
		else
			System.out.println("Given number " + temp + " is not Armstrong");
	}
}
