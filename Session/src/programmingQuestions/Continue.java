package programmingQuestions;

public class Continue {

	public static void main(String[] args) {

		String[] values = { "cat", "bear", "dog", "bird" };

		for (String value : values) {

			if (value.startsWith("b")) {
				continue;
			}

			System.out.println(value);
		}
	}
}
