package fiftyQuestionCollections;

public class ArrayShuffle {

	public static void main(String[] args) {

		String[] array = { "a1", "a2", "a3", "a4", "a5", "a6", "b1", "b2", "b3", "b4", "b5", "b6" };

		int middle = array.length / 2;
		String[] array2 = new String[array.length];

		for (int i = 0; i < middle; i++) {
			array2[2 * i] = array[i];
			array2[2 * i + 1] = array[i + middle];
		}

		for (String str : array2) {
			System.out.print(str + " ");
		}
	}
}