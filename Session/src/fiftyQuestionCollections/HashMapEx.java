package fiftyQuestionCollections;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(1, "Apple");
		hmap.put(2, "Banana");
		hmap.put(3, "Orange");
		hmap.put(4, "Kiwi");

		String val = hmap.get(4);
		System.out.println("The Value mapped to Key 4 is:" + val);

		String val2 = hmap.get(5);
		System.out.println("The Value mapped to Key 5 is:" + val2);
	}

}
