package programmingQuestions;

public class LoopOverflow {
	public static void main(String[] args) {

		long iterations = 0;
		// Count iterations from 10 to 20 decrementing.
		for (int i = 10; i <= 20; i--) {
			iterations++;
		}
		System.out.println("Iterations from 10 to 20: " + iterations);
	}
}
