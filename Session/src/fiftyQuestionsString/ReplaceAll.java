package fiftyQuestionsString;

public class ReplaceAll {

	public static void main(String[] args) {

		String str = "Hello World! Welcome to this Java Session";

		String Str1 = str.replaceAll("Hello", "Good Morning");

		System.out.println(Str1);

		Str1 = str.replaceAll("this", "that");

		System.out.println(Str1);

		Str1 = str.replaceAll("to", "");

		System.out.println(Str1);

		Str1 = str.replaceAll("Welcome", "");

		System.out.println(Str1);

	}
}
