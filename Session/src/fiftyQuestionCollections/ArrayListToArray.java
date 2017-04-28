package fiftyQuestionCollections;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {

		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("Tiger");
		arrlist.add("Lion");
		arrlist.add("Monkey");
		arrlist.add("Giraffe");

		String array[] = new String[arrlist.size()];
		for (int j = 0; j < arrlist.size(); j++) {
			array[j] = arrlist.get(j);
		}

		for (String k : array) {
			System.out.println(k);
		}
	}
}
