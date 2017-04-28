package fiftyQuestionsArray;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {

		int[] num = new int[] { 3, 2, 5, 4, 1 };

		System.out.print("Original Array : ");
		for (int i = 0; i < num.length; i++)
			System.out.print("  " + num[i]);

		Arrays.sort(num);

		System.out.println("\n Sorted int array : ");
		for (int i = 0; i < num.length; i++)
			System.out.print("  " + num[i]);

		// int[] nums = new int[] { 5, 2, 3, 1, 4 };
		// Arrays.sort(num);

	}
}
