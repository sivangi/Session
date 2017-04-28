package moreQuestions;

public class JustForTest {

	public static void revEachWord() {

		String str = "Java is easy";

		StringBuilder sb = new StringBuilder();
		
		String[] words = str.split("  ");

		for (String word : words)
			for (int i = word.length()-1;i>=0; i--) {

				sb.append(word.charAt(i));

				//sb.append(" ");

			}

		System.out.println(sb.toString());

	}

	public static void main(String[] args) {

		JustForTest.revEachWord();
	}

}
