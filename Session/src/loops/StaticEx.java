package loops;

public class StaticEx {

	private String first;//for first name for regular variables
	private String last;//for last name
	
	private static int students= 0;//a variable that they can share..if this changes..this changes with all objects..
	
	
	public StaticEx(String fn,String ln){
		
		first = fn;
		last = ln;
		students++;//so if we add each time,it will add to the member variable.
		
		System.out.printf("Constructor for %s %s,students in the class:%d\n",first,last,students );//constructor for fn ln,student in the class number
	}
	
	public String getFirst(){
		
		return first;
	}
		public String getLast()
		{
			return last;
		}
	
		public static int getStudents()
		{
			return students;
		}
}
