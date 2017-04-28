package programmingQuestions;

public class PrintTo10Recursion {

	public static void main(String[]args){
		
		int number = 0;
		recurse(number);
	}
	
	public static void recurse(int number){
		
		if(number<=10){
			
			System.out.println(number);
			
			number++;
			recurse(number);
		}
	}
}
