package fiftyQuestionSolved;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		int n = 7;
		int result = factorial(n);
		System.out.println("The factorial of 7 is " + result);
	}

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
