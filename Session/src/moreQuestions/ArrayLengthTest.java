package moreQuestions;

public class ArrayLengthTest {
	private static void printArrayLength(String[] anArray) {
		if (anArray == null) {
			System.out.println("The length of the array can't be determined.");
		} else {
			int arrayLength = anArray.length;
			System.out.println("The length of the array is: " + arrayLength);
		}
	}

	public static void main(String[] args) {
		String[] testArray1 = { "Apple", "Banana", "Carrots" };
		String[] testArray2 = { "A", "B" };
		String[] testArray3 = { "1", "2", "3", "4" };
		String[] testArray4 = { "Test" };
		printArrayLength(null);
		printArrayLength(testArray1);
		printArrayLength(testArray2);
		printArrayLength(testArray3);
		printArrayLength(testArray4);
	}
}
