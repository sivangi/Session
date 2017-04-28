package fiftyQuestionsArray;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindCommons {

	public static void main(String[] args) {
		Integer[] arrayOne = { 1, 4, 5, 2, 7, 3, 9 };
		Integer[] arrayTwo = { 5, 2, 4, 9, 5 };

		Set<Integer> set1 = new LinkedHashSet<Integer>(Arrays.asList(arrayOne));
		Set<Integer> set2 = new LinkedHashSet<Integer>(Arrays.asList(arrayTwo));

		for (Integer commons : set2) {
			if (!set1.add(commons)) {
				System.out.println("The duplicate element of an Array is " + commons);
			}
		}
	}
}
