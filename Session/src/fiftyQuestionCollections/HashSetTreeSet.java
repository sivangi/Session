package fiftyQuestionCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetTreeSet {

	public static void main(String[] args) {

		HashSetTreeSet.hashSet();
		HashSetTreeSet.treeSet();
		HashSetTreeSet.linkedHashSet();

	}

	public static void hashSet() {

		HashSet<String> hSet = new HashSet<String>();

		hSet.add("This");
		hSet.add("is");
		hSet.add("an");
		hSet.add("example");
		hSet.add("of");
		hSet.add("HashSet");
		hSet.add(null);

		System.out.println(hSet);
	}

	public static void treeSet() {

		TreeSet<String> tSet = new TreeSet<String>();

		tSet.add("This");
		tSet.add("is");
		tSet.add("an");
		tSet.add("example");
		tSet.add("of");
		tSet.add("TreeSet");
		// tSet.add(null);

		System.out.println(tSet);

	}

	public static void linkedHashSet() {

		LinkedHashSet<String> linkedHS = new LinkedHashSet<String>();

		linkedHS.add("This");
		linkedHS.add("is");
		linkedHS.add("an");
		linkedHS.add("example");
		linkedHS.add("of");
		linkedHS.add("LinkedHashSet");

		System.out.println(linkedHS);

	}

}
