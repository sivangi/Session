package fiftyQuestionCollections;

import java.util.Collections;
import java.util.List;

public class EmptyList {

	public static void main(String[] args) {

		List<Object> emptylist = Collections.emptyList();

		System.out.println("This list is empty " + emptylist);

		emptylist.add("Apple");
		emptylist.add("Banana");
	}

}
