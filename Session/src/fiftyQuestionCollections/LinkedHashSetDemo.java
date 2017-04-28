package fiftyQuestionCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetDemo {

	public static void main(String args[]) {

		LinkedHashSetDemo.linkedHashSet();
		LinkedHashSetDemo.hashSet();
		LinkedHashSetDemo.treeSet();

	}

	public static void linkedHashSet() {
		LinkedHashSet<String> hs = new LinkedHashSet<>();

		// add elements to the hash set
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		hs.add(null);
		System.out.println("Linked hashSet:" +hs);
	}

	public static void hashSet() {

		HashSet<String> hset = new HashSet<>();
		hset.add("A");
		hset.add("C");
		hset.add("B");
		hset.add("S");
		hset.add("D");
		hset.add("R");
		hset.add("E");
		hset.add(null);
		hset.add("A");

		System.out.println("HashSet example:" +hset);

	}

	public static void treeSet() {

		TreeSet<String> tset = new TreeSet<>();

		tset.add("E");
		tset.add("S");
		tset.add("C");
		tset.add("A");
		tset.add("B");
		tset.add("D");
		tset.add("F");
		tset.add("G");
		tset.add("O");
		tset.add("P");
		//tset.add(null);

		System.out.println("Treeset example"+tset);

	}
}
