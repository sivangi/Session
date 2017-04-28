package fiftyQuestionCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList  <String> s = new ArrayList<>();
      
      
      s.add("Aster");
      s.add("Peoni");
      s.add("Camelia");
      s.add("Zinnia");
      s.add("Petunia");
      s.add("Daisy");
	
     // s.addAll(12);
      
      System.out.print("Original contents of s: ");
      
      	Iterator<String> it = s.iterator();
      	
      	//System.out.println(it.next());
      	int i = 1;
      while(it.hasNext())
      {
    	  
    	  System.out.print(i++);
    	  System.out.println(" " + it.next());
      }
      
      System.out.println("ArrayList contains the string 'Peoni': "
              +s.contains("Peoni"));
      
	}
	

}
