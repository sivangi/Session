package fiftyQuestionCollections;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesUsingSet {
	
	public static void main(String args[]) { 
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" }; 

	System.out.println("Duplicate elements from array using HashSet data structure"); 
	Set<String> store = new HashSet<>(); 
	for (String name : names) { 
		if (store.add(name) == false) { 
		System.out.println("found a duplicate element in array : " + name); } }
	}

	

}
