package fiftyQuestionsString;

public class StringExample {

	public static void main(String[] args) {

		String s = "Hello";
		String so = "Hello";

		String s1 = new String("hello");
		String s2 = new String("Hello");

		System.out.println(s == so);
		
		System.out.println(s==s2);
		
		System.out.println(s.equals(s2));
		
		System.out.println(s1 == s2);
		
		
		System.out.println(s1 = s2);

	}
}
