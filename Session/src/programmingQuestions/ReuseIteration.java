package programmingQuestions;

public class ReuseIteration {

	public static void main(String[] args) {

		int x = 0;

		for (; x < 3; x++) {
			System.out.println(x);
		}
		System.out.println("x is still reachable!");
		System.out.println(x);
	}
}
