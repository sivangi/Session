package moreQuestions;

public class ConcatStrings {

	public static void main(String[] args) {

		String b = "Today is Wednesday. ";
		String c = "Yet,another Java session";

		String d = b + c;
		System.out.println(d);

		d = b.concat(c);
		System.out.println(d);
	}
}
