package fiftyQuestionsString;

public class WriteBackwards {

	public static void revMe() {

		String str[] = "Java is easy".split(" ");
		String revWords = "  ";
		for (int i = str.length - 1; i >= 0; i--) {
			revWords += str[i] + "  ";
			{

			}
			//System.out.println("Java is easy");
		}
		System.out.println(revWords);
	}

	public static void main(String[] args) {

		WriteBackwards.revMe();

	}
}
