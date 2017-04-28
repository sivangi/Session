package fiftyQuestionsString;

public class IndexOf {
	
	
public static void main(String[] args){
	
	String string = "It was hot (so hot!) I'm telling you.";
	int left = string.indexOf("(");
	int right = string.indexOf(")");

	// pull out the text inside the parens
	String sub = string.substring(left+1, right); // sub is "so hot!"

	sub = sub.toUpperCase();  // sub is "SO HOT!"

	// Put together a new string
	String result = string.substring(0, left+1) +   // It was hot (
	  sub +                           // SO HOT!
	  string.substring(right);        // ) I'm telling you.

	
	System.out.println(result);
}
}
