package fiftyQuestionSolved;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		int num = scanner.nextInt();
		scanner.close();
		IsPrime primeNum = new IsPrime();

		if (primeNum.isPrime(num)) {
			System.out.printf("\n Result: The number %d is Prime", num);
		} else {
			System.out.printf("\n Result: The number %d is not Prime", num);
		}
	}

	// Method to check whether the number is prime or not
	boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;

	}

}
