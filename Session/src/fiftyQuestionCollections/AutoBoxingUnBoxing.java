package fiftyQuestionCollections;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {
		int i = 5;
		long j = 105L;

		doSomething(i);
		System.out.println(i);

		List<Long> list = new ArrayList<>();

		list.add(j);
	}

	private static void doSomething(Integer in) {

		@SuppressWarnings("unused")
		int j = in;

		doPrimitive(in);
		System.out.println(in);
	}

	private static void doPrimitive(int i) {

	}
}
