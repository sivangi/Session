package fiftyQuestionsArray;

public class SingleDimensionalArray {

	public static void main(String[] args) {

		int[] arr = new int[3];// Declaration of allocating memory to an array

		arr[0] = 1;// Initializing elements
		arr[1] = 2;
		arr[2] = 3;

		for (int i = 0; i < arr.length; i = i + 1) {// Use for loop to display
													// elements
			System.out.println(arr[i]);

			// Arrays can be initialized when they are
			// declaring as given below:

			// int arr[] = {1,2,3};
		}
	}

}
