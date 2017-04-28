package fiftyQuestionCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayAndArrayList {

	public static void main(String[] args) {

		ArrayList<String> aList = new ArrayList<String>();

		aList.add("What is Java");
		aList.add("It is a programming language");
		aList.add("Java is interesting");

		Iterator<String> it = aList.iterator();

		System.out.println("Array List output :");

		while (it.hasNext())
			System.out.println(it.next());

		// Array Example

		String[] arrEg = new String[3];

		arrEg[0] = "What is Java";

		arrEg[1] = "It is a programming language";

		arrEg[2] = "Java is interesting";

		System.out.println("Array output :");

		for (int i = 0; i < arrEg.length; i++) {

			System.out.println(arrEg[i] + " ");
		}

	}
}
