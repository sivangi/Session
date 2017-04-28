package fiftyQuestionsString;

public class ReverseAString {

	public static void reverseWithLoop() {
		String str = "Java is easy";

		String result = " ";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += (str.charAt(i));

		}
		System.out.println(result);
	}

	public static void main(String[] args) {

		ReverseAString.reverseWithLoop();

	}
}
// charAt() is a method that returns the character from the specified index.
// Characters in a string are indexed from left to right.
// The index of the first character is 0, and the index of the last character in
// a string, called stringName, is stringName.length – 1.
