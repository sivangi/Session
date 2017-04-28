package loops;

public class PrintEvenNumbers {

	public int printEvens(int n) {
		// int num = 0;
		for (int i = 2; i <= n; i++) {

			if (i % 2 == 0)

				System.out.println(i);
		}
		return n;

	}

	public static void main(String args[]) {

		PrintEvenNumbers pen = new PrintEvenNumbers();
		pen.printEvens(250);
	}
}
