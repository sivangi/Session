package fiftyQuestionCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a1 = new ArrayList<>();

		a1.add("Apple");
		a1.add("Banana");
		a1.add("Pear");
		a1.add("Grapes");
		a1.add("Mango");
		a1.add("Orange");

		System.out.println("Original contents of a1");
		Iterator<String> it = a1.iterator();

		while (it.hasNext()) {
			Object element = it.next();
			System.out.println(element);

		}

	}
}
