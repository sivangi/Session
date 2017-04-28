package fiftyQuestionsArray;

public class Smallest {

	public static void main(String[] args) {

		int numbers[] = new int[] { 2, 5, 6, 7, -1, 2 };

		int smallest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < smallest)
				smallest = numbers[i];

		}
		System.out.println("Smallest number is " + smallest);

	}
}
