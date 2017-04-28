package loops;

public class BreakInLoops {

	public static void main(String[] args) {

		int[] values = { 1, 2, 3, -1 };

		// ... Loop over array indexes, but break on negative one.
		for (int i = 0; i < values.length; i++) {
			if (values[i] == -1) {
				break;
			}
			System.out.println(values[i]);
		}
	}
}
