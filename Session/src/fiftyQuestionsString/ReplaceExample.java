package fiftyQuestionsString;

public class ReplaceExample {

	public static void main(String[] args) {
		String words = "hello world, i am a java program, how are you today?";
		char from = 'a';
		char to = 'o';

		// String ss = words.replace(from, to);
		System.out.println(words);
		String ss = replace(words, from, to);// Receiving String from replace()
		System.out.println("New Replace String is =>  " + ss);
	}

	public static String replace(String s, char from, char to) {
		if (s.length() < 1)
			return s;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == from) {
				s = s.substring(0, i) + to + s.substring(++i);
				System.out.println(s);
				return replace(s, from, to);// calling replace()
			}
		}
		return s;
	}

}
