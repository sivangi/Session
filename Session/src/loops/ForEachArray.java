package loops;

public class ForEachArray {

	public static void main(String[] args) {

		String[] values = new String[3];
		values[0] = "Java";
		values[1] = "Is";
		values[2] = "Easy";

		for (String value : values) {
			System.out.println(value);
		}
	}
}
