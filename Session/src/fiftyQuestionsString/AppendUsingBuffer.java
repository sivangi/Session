package fiftyQuestionsString;

public class AppendUsingBuffer {

	public static void main(String[] args) {

		String s = "This is nice";

		String s1= "1 2 3";
		StringBuffer sb = new StringBuffer();

		String[] str1 = s.split(" ");
		String[] str2 = s1.split(" ");

		for (int i = 0; i < str1.length; i++) {

			sb.append(str1[i]);
			sb.append(str2[i]);

		}

		System.out.println("Original String " + s);
		System.out.println("Appended string " + sb.toString());

	}
}
