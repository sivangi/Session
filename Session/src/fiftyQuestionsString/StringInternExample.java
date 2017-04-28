package fiftyQuestionsString;

public class StringInternExample {

	public static void main(String args[]) {

		String str1 = "Java";

		String str2 = new String("Java");

		String str3 = new String("Java").intern();

		System.out.println("Are str1 and str2 the same: " + (str1 == str2));

		System.out.println("Are str1 and str2.intern() the same: " + (str1 == str2.intern()));

		System.out.println("Are str1 and str3 the same: " + (str1 == str3));

	}
}
