package loops;

public class StaticMain {

	@SuppressWarnings({ "unused" })
	public static void main (String[]args){
		
		StaticEx student1 = new StaticEx("Bob","Bush");
		StaticEx student2 = new StaticEx("John","Smith");
		StaticEx student3 = new StaticEx("Raul","Jones");
		StaticEx student4 = new StaticEx("Raul","Jones");//each student have their own set of variables which all share the student variable
		
		
		
		System.out.println(StaticEx.getStudents());

		//System.out.println(student1.getFirst());

		//System.out.println(student1.getLast());

		//System.out.println(student1.getStudents());
	}
	
}
