package fiftyQuestionCollections;

import java.util.Arrays;
import java.util.List;

public class ListExample {

	
	public static void main(String[]args){
		
		List<String> listNames = Arrays.asList("Tom", "John", "Mary", "Peter", "David", "Alice");
		System.out.println("Original list: " + listNames);
		 
		List<String> subList = listNames.subList(2, 5);
		System.out.println("Sub list: " + subList);
	}
}
