package fiftyQuestionsString;

public class AppendNumber {

	public static void main(String[] args)

	{

		String s = "This is a nice day";

		System.out.println(AppendNumber.appendNumbers(s));
	}

	public static String appendNumbers(String s) {

		int count = 1;
		String[] s1 = s.split(" ");

		for (String num : s1) {

			System.out.print(num + count++ + " ");
		}

		return s;

	}
}