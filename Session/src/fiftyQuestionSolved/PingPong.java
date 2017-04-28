package fiftyQuestionSolved;

public class PingPong {
	
	public static void main(String[] args) {

		for (int i = 1; i < 50; i++) {

			if (i % 3 == 0) {

				System.out.println("Ping");
			}

			if (i % 5 == 0) {

				System.out.println("Pong");
			}

			if ((i % 3 == 0) && (i % 5 == 0))

			{
				System.out.println("Ping Pong");
			}
			if ((i % 3 != 0) && (i % 5 != 0)) {

				System.out.println(i);

			}

		}
	}
}
