package fiftyQuestionCollections;

public class EnumElements {

	public enum Months {
		January, February, March, April, May, June, July, August, September, October, November, December
	}

	public static void main(String[] args) {
		for (Months m : Months.values())
			System.out.println(m);

	}
}
