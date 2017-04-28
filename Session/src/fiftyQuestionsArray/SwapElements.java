package fiftyQuestionsArray;

import java.util.Arrays;

public class SwapElements {

	public static void main(String[] args) {

		int[] unsorted = { 1, 2, 5, 6, 7, 8, 4, 9 };
		System.out.println("integer array before sorting : " + Arrays.toString(unsorted));
		insertionSort(unsorted);
		System.out.println("integer array after sorting  : " + Arrays.toString(unsorted));
	}

	public static void insertionSort(int[] unsorted) {
		for (int i = 1; i < unsorted.length; i++) {
			int j = i;
			while (j > 0 && unsorted[j] < unsorted[j - 1]) {
				// swap
				int temp = unsorted[j - 1];
				unsorted[j - 1] = unsorted[j];
				unsorted[j] = temp;
				j--;
			}
		}
	}

}
