package fiftyQuestionsArray;

public class FindMissing {

	static int arr[] = { 3, 5, 8, 10, 20, 25, 29, 30, 35, 44, 49 }; // given
																	// array

	public static void main(String[] args) {
		displayMissing();
	}

	/*
	 * Method finds out missing number in given range.
	 */
	static public void displayMissing() {

		System.out.print("Sorted array ");
		for (int j = 0; j < arr.length; j++)
			System.out.print(arr[j] + " "); // display it

		System.out.print("\nNumbers missing between 1 to 50 in array :  ");

		int j = 0;
		for (int i = 1; i <= 50; i++) {
			if (j < arr.length && i == arr[j])
				j++;
			else
				System.out.print(i + " ");

		}

	}

}
