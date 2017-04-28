package programmingQuestions;

public class ForLoopStrings {

	    public static void main(String[] args) {

		String value = "art";

		// Loop from 0 to length() of the string.
		for (int i = 0; i < value.length(); i++) {
		    // Get letters with charAt method.
		    char letter = value.charAt(i);
		    System.out.println(letter);
		}
	    }
	}



