package moreQuestions;

public class StringReverse {

	public static void reverseWithLoop() {
		String str = "Java is easy";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) {

		StringReverse.reverseWithLoop();

	}
}
