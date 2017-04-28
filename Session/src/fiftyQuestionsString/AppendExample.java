package fiftyQuestionsString;

public class AppendExample {

	public static void main(String[] args) {

		String s1 = "This is nice";
		System.out.println(s1);

		StringBuilder sb3 = new StringBuilder().append("This").append('1').append(' ').append("is").append('2')
				.append(' ').append("nice").append('3');
		System.out.println(sb3.toString());
	}

}
