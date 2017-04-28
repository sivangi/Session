package fiftyQuestionCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEg {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");

		ListIterator<String> listIterator = list.listIterator(list.size());

		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}
}