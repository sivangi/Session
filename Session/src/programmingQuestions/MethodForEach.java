package programmingQuestions;

public class MethodForEach {
	static int count;

	static int[] getElements() {
		// Set array elements based on a static field.
		int[] array = new int[3];
		array[0] = count++;
		array[1] = count++;
		array[2] = count++;
		return array;
	}

	public static void main(String[] args) {

		// The method is called once and not many times in the for-loop.
		for (int value : getElements()) {
			System.out.println(value);
		}
	}
}
