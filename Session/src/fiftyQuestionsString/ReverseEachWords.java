package fiftyQuestionsString;

public class ReverseEachWords {

	public static void revWords() {

		String input = "Java is easy";

		StringBuilder sb = new StringBuilder();

		String words[] = input.split(" ");// empty string

		for (String word : words) {

			for (int i = word.length() - 1; i >= 0; i--) {

				sb.append(word.charAt(i));
			}
			sb.append(" ");// when we reverse we need another empty loop
		}
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {

		ReverseEachWords.revWords();
	}

}
